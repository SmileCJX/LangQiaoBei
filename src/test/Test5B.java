package test;

//第n个素数
public class Test5B {
	public static void main(String[] args) {
		int N = 1000*1000*10;
		int x = 100001;
		byte[] a = new byte[N];
		for (int i=2; i<N/2; i++){
			if (a[i]==1) continue; //合数没有办法参加筛法
			
			for (int k=2; k<=N/i; k++){
				if (i*k<N) a[i*k] = 1;
			}
		}
		
		int m = 0;
		for (int i=2; i<N; i++){
			if (a[i]==0){
				m++;
				if (m==x) System.out.println(i+" ");
			}
		}
	}
}
