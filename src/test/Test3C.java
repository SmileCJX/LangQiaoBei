package test;

public class Test3C {
	public static void main(String[] args) {
		int sum = 6;
		int [] a = {3,2,4,3,1};	
		boolean [] b = new boolean[a.length];  //表示a的对应项是否选取
		g(6,a,0,0,b);
	}
	
	// sum:有错的和
	// a:明细
	// k:当前处理的位置
	// cur_sum:前边的元素累加和
	// b:记录取舍
	public static void g(int err_sum,int[] a,int k,int cur_sum,boolean [] b){
		if(cur_sum > err_sum) return;
		
		if(err_sum == cur_sum){
			for(int i=0; i<b.length; i++){
				if(b[i]==false){
					System.out.print(i + " ");
				}
			}
			System.out.println();
			return;
		
		}
		
		if(k >= a.length) return;
		
		b[k] = false;
		g(err_sum,a,k+1,cur_sum,b);
		
		b[k] = true;
		cur_sum += a[k];
		g(err_sum,a,k+1,cur_sum,b);
		b[k] = false; //回溯！！！
	}
}
