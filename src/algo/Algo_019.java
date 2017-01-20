package algo;

import java.util.Scanner;

public class Algo_019 {
	public static int [][] a = new int[11][11];
	public static int [][][][] dp = new int[11][11][11][11];
	
	public static void main(String[] args) {
		/**
		 * ������һ�Σ��ߵ����������һ��λ�þ���һ��״̬����Ҫ�������Σ���Ȼ�ߵ������ĳ��λ��ֻ��һ��״̬��һ���֣�������������������״̬������һ������Ȼ���ǵڶ����ߵ���λ���ˡ�������ǰ��������ֺ���������һ��������״̬�ˡ�

���ǣ����һ��״̬opt[i1,j1,i2,j2]��ʾ����·�ֱ��ߵ���i1,j1����ͣ�i2,j2����ʱȡ�������ֵ����Ȼ������4�У��˷�ԭ��һ��������*��һ��������У�

�����ϣ��ϣ����ϣ��󣩣����ϣ��������Ϻ����ʾ���ĸ������ߵ��õ㣬��ȻҪע���ߵ�ͬ�У�ͬ�У�ͬ��ʱ���������ΪҪ��·�����ظ�����


��״̬��f[i][j][k][l]��ʾ���˷ֱ�(i,j)��(k,l)��ȡ�������ĺ�.G[i][j]��ʾ���������.

�����̡�f[i][j][k][l] = max{f[i-1][j][k-1][l], f[i-1][j][k][l-1], f[i][j-1][k-1][l], f[i][j-1][k][l-1]}+G[i][j]+(i==k&&j==l ? 0 : G[k][l])
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
