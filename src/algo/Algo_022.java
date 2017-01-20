package algo;

import java.util.Scanner;

public class Algo_022 {
	public static void main(String[] args) {
		/**
		 * dp[i,j]��ʾ��i�ֳ�j�ݵķ�������
dp[i,j]:=dp[i-j,1]+dp[i-j,2]+dp[i-j,3]+��+dp[i-j,j-1]+dp[i-j,j];

ʱ�临�Ӷ���n*k^2��O(n*k)�ķ�����

���ڣ�

dp[i,j]=dp[i-j,1]+dp[i-j,2]+��+dp[i-j,j];

dp[i-1,j-1]=dp[(i-1)-(j-1),1]+dp[(i-1)-(j-1),2]+��+dp[(i-1)-(j-1),j-1]
=dp[i-j,1]+dp[i-j,2]+��+dp[i-j,j-1];

��ˣ�

dp[i,j]=dp[i-j,1]+dp[i-j,2]+��+dp[i-j,j-1]+dp[i-j,j]
=dp[i-1,j-1]+dp[i-j,j];
		 */
		Scanner input = new Scanner(System.in);
		int n =  input.nextInt();
		int k =  input.nextInt();
		int [][] dp = new int[222][10];
		
		dp[0][0] = 1;
		for (int i=1; i<=n; i++){
			for (int j=1; j<=k; j++){
				if (i>=j){
					dp[i][j] = dp[i-j][j]+dp[i-1][j-1];
				}
			}
		}
		System.out.println(dp[n][k]);
	}
}
