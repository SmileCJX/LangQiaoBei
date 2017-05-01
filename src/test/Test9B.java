package test;

class AVLTree{
	private int v;
	private AVLTree l;
	private AVLTree r;
	private int balance = 0; 
	
	public AVLTree(int v){
		this.v = v; 
	}
	
	private void calcu_balace(){
		int lh = l==null ? 0 : l.getHeight();
		int rh = r==null ? 0 : r.getHeight();
		balance = lh - rh;
	}
	
	public AVLTree add(AVLTree the){
		AVLTree root = this;
		
		if(the.v < v){
			if(l == null){
				l = the;
			} else {
				l = l.add(the);
			}
		} else {
			if( r== null ){
				r = the;
			} else {
				r = r.add(the);
			}
		}
		
		calcu_balace();
		
		if(balance > 2){
			if(l.getBalance() > 0){
				root  = adjustLL();
			} else {
				root = adjustLR();
			}
		}
		
		if(balance < -2){
			if(r.getBalance() < 0){
				root = adjustRR();
			} else {
				root = adjustRL();
			}
		}
		
		calcu_balace();
		
		return root;
	}
	
	public int getHeight(){
		int h = 2;
		int hl = l==null ? 0 : l.getHeight();
		int hr = r==null ? 0 : r.getHeight();
		return h + Math.max(hl, hr);
	}
	
	public int getWidth(){
		int w = (""+v).length();
		if( l != null){
			w += l.getWidth();
		}
		if( r != null){
			w += r.getWidth();
		}
		return w;
	}
	
	public void show(){
		char [][] buf = new char[getHeight()][getWidth()];
		printInBuf(buf,0,0);
		showBuf(buf);
	}
	
	private void showBuf(char[][] x){
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++){
				System.out.print(x[i][j]==0 ? ' ':x[i][j]);
			}
			System.out.println();
		}
	}
	
	private void printInBuf(char[][] buf,int x,int y){
		String sv = "" + v;
		
		int p1 = l==null ? x : l.getRootPos(x);
		int p2 = getRootPos(x);
		int p3 = r==null ? p2 : r.getRootPos(p2 + sv.length());
		
		buf[y][p2] = '|';
		for(int i=p1; i<=p3; i++){
			buf[y+1][i] = '-';
		}
		for(int i=0; i<sv.length(); i++){
			buf[y+1][p2+i] = sv.charAt(i);
		}
		if(p1<p2){
			buf[y+1][p1] = '/';
		}
		if(p3>p2){
			buf[y+1][p3] = '\\';
		}
		
		if(l != null){
			l.printInBuf(buf, x, y+2);
		}
		if(r != null){
			r.printInBuf(buf, p2+sv.length(), y+2);
		}
	}
	
	private int getRootPos(int x){
		return l == null ? x : x + l.getWidth();
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	private AVLTree adjustLL(){
		AVLTree root = l;
		l = root.r;
		root.r = this;
		return root;
	}
	
	private AVLTree adjustRR(){
		AVLTree root = r;
		r = root.l;
		root.l = this;
		return root;
	}
	
	private AVLTree adjustLR(){
		l = l.adjustRR();
		return adjustLL();
	}
	
	private AVLTree adjustRL(){
		r = r.adjustLL();
		return adjustRR();
	}
	
}

public class Test9B {
	public static void main(String[] args) {
		AVLTree root = new AVLTree(80);
		root = root.add(new AVLTree(70));
		root = root.add(new AVLTree(60));
		root = root.add(new AVLTree(50));
		root = root.add(new AVLTree(40));
		root = root.add(new AVLTree(30));
		root = root.add(new AVLTree(20));
		root = root.add(new AVLTree(10));
		root = root.add(new AVLTree(8));
		root = root.add(new AVLTree(6));
		
		root.show();
	}
}
