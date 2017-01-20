package adv;

import java.util.Scanner;

public class Adv_196 {
	public static int mod = 1000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] a = new int[101];
		int [][] f = new int[101][101];
		for(int i=1; i<=n; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=m; j++){
				for(int k=0; k<=a[i]&&k<=j; k++){
					f[i][j] = (f[i][j]+f[i-1][j-k])%mod;
				}
			}
		}
		
		System.out.println(f[n][m]);
	}
}	
