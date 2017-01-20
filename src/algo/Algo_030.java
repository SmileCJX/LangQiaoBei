package algo;

import java.util.Scanner;

public class Algo_030 {
	public static void main(String[] args) {
		int m,n,i,v;
		int []w = new int[101];
		int []c = new int[101];
		int []f = new int[1001];
		
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();//能够用来采药的时间
		n = sc.nextInt();//山洞里的草药的数目
		
		for (i=1; i<=n; i++){
			w[i] = sc.nextInt();//采摘某株草药的时间
			c[i] = sc.nextInt();//草药的价值
		}
		
		for(i=1; i<=n; i++){
			for(v=m; v>=w[i]; v--){
				if(f[v]<(f[v-w[i]])+c[i]){
					f[v]=f[v-w[i]]+c[i];
				}
			}
		}
		
		System.out.println(f[m]);
	}
}
