package algo;

import java.util.Scanner;

public class Algo_019 {
	public static int [][] a = new int[11][11];
	public static int [][][][] dp = new int[11][11][11][11];
	
	public static void main(String[] args) {
		/**
		 * 对于走一次，走到矩阵的任意一个位置就是一个状态，而要是走两次，显然走到矩阵的某个位置只是一个状态的一部分，不能完整的描述整个状态。那另一部分显然就是第二次走到的位置了。如果我们把这两部分合起来就是一个完整的状态了。

于是，设计一个状态opt[i1,j1,i2,j2]表示两条路分别走到（i1,j1）点和（i2,j2）点时取到的最大值。显然决策有4中（乘法原理一个点两种*另一个点的两中）

即（上，上）（上，左）（左，上）（左，左）上和左表示从哪个方向走到该点，当然要注意走到同行，同列，同点时的情况（因为要求路径不重复）。


【状态】f[i][j][k][l]表示两人分别到(i,j)、(k,l)所取过的数的和.G[i][j]表示方格里的数.

【方程】f[i][j][k][l] = max{f[i-1][j][k-1][l], f[i-1][j][k][l-1], f[i][j-1][k-1][l], f[i][j-1][k][l-1]}+G[i][j]+(i==k&&j==l ? 0 : G[k][l])
		 */
		int n,r,c,v;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while(true){
			r = sc.nextInt();
			c = sc.nextInt();
			v = sc.nextInt();
			if(r!=0 && c!=0 && v!=0){
				a[r][c] = v;
			}else{
				break;
			}
		}
		
		System.out.println(operDp(n));
	}

	private static int operDp(int n) {
		int i1,j1,i2,j2;
		int temp;
		for (i1 = 1;i1<=n; i1++){
			for(j1 = 1; j1<=n; j1++){
				for(i2 = 1; i2<=n; i2++){
					for(j2 = 1; j2<=n; j2++){
						temp = Integer.MIN_VALUE;
						temp = Math.max(temp, dp[i1-1][j1][i2-1][j2]);
						temp = Math.max(temp, dp[i1-1][j1][i2][j2-1]);
						temp = Math.max(temp, dp[i1][j1-1][i2-1][j2]);
						temp = Math.max(temp, dp[i1][j1-1][i2][j2-1]);
						
						if(i1==i2 && j1==j2){
							dp[i1][j1][i2][j2] = temp + a[i1][j1];
						}else{
							dp[i1][j1][i2][j2] = temp + a[i1][j1] + a[i2][j2];
						}
					}
				}
			}
		}
		return dp[n][n][n][n];
	}
}
