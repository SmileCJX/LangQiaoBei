package adv;

import java.util.Scanner;

public class Adv_062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [][] a = new int[101][101];
		int [][] f = new int[101][101];
		
		for (int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=n; i>=0; i--){
			for(int j=1; j<=i; j++){
				f[i][j] = Math.max(f[i+1][j], f[i+1][j+1])+a[i][j];
			}
		}
		
		System.out.println(f[1][1]);
	}
}
