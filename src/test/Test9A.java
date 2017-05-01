package test;

import java.util.TreeSet;

//线性结构。数组，vector stack..
//树形结构
//图

//递归定义法
class BiTree{
	private int v; //乘客
	private BiTree l;
	private BiTree r;
	
	public BiTree(int x){
		v = x;
	}
	
	public void add(BiTree the){
		if(the.v < v){
			if(l == null){
				l = the;
			} else {
				l.add(the);
			}
		} else {
			if(r == null){
				r = the;
			} else {
				r.add(the);
			}
		}
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
	
	//中序遍历
	public void mid_trav(){
		if(l != null){
			l.mid_trav();
		}
		System.out.println(v);
		if(r != null){
			r.mid_trav();
		}
	}
	
}

public class Test9A {
	public static void main(String[] args) {
		//二叉树
		BiTree root = new BiTree(100);
		root.add(new BiTree(50));
		root.add(new BiTree(80));
		root.add(new BiTree(40));
		root.add(new BiTree(35));
		
//		root.mid_trav();
		root.show();
	}
}
