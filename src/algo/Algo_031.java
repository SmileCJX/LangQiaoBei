package algo;

import java.util.Scanner;

public class Algo_031 {
	
	public static int [] money = new int[26];
	public static int [] importances = new int[26];
	public static int [] dp = new int[30001];
	
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int v,p;
		for (int i=1; i<=m; i++){
			v = sc.nextInt();
			p = sc.nextInt();
			
			for (int j=n; j>=v; j--){
				if(dp[j] < dp[j-v]+v*p){
					dp[j] = dp[j-v]+v*p;
				}
			}
		}
		int max = 0;
		for(int i=1; i<n; i++){
			if(dp[i]>max){
				max = dp[i];
			}
		}
		
		System.out.println(max);
	}
}
