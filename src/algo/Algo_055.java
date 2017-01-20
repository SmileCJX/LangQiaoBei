package algo;

import java.util.Scanner;

public class Algo_055 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int [][] arr1 = new int[n][m];
		int [][] arr2 = new int[n][m];
		
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				arr1[i][j] = input.nextInt();
			}
		}
		
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				arr2[i][j] = input.nextInt();
			}
		}
		
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				arr1[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
