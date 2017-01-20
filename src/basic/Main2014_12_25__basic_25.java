package basic;

import java.util.Scanner;

public class Main2014_12_25__basic_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		
		int [] [] arr = new int[m][n];
		int [] [] label = new int[m][m];
		
		//输入数据和做标记
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				arr[i][j] = input.nextInt();
				label[i][j] = 1;
			}
		}
		
		int total = 0,i=1,j=0;
		System.out.print(arr[0][0]+" ");
		label[0][0]=0;
		while(total < m*n){
			while(i<=m && label[i][j]==1){
				System.out.print(arr[i][j]+" ");
				label[i][j]=0;
				i++;
				total++;
			}
			i--;
			j++;
			
			while(j<=n && label[i][j]==1){
				System.out.print(arr[i][j]+" ");
				label[i][j]=0;
				j++;
				total++;
			}
			i--;
			j--;
			
			while(i>=1 && label[i][j]==1){
				System.out.print(arr[i][j]+" ");
				label[i][j]=0;
				i--;
				total++;
			}
			i++;
			j--;
			
			while(j>=1 && label[i][j]==1){
				System.out.print(arr[i][j]+" ");
				label[i][j]=0;
				j--;
				total++;
			}
			i++;
			j++;
		}
	}
}
