package algo;

import java.util.Scanner;

public class Algo_035 {
	public static void main(String[] args) {
		int n,m;
		int [][] count = new int[32][32];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		count[0][1] = 1;
		count[0][n+1] = 1;
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				count[i][j] = count[i-1][j-1]+count[i-1][j+1];
			}
			count[i][0] = count[i][n];
			count[i][n+1] = count[i][1];
		}
		
		System.out.println(count[m][1]);
	}

}
