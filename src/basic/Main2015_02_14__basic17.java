package basic;

import java.util.Scanner;

public class Main2015_02_14__basic17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		int [][] arr = new int[n][n];
		int [][] result = new int[n][n];
		int [][] temp = new int[n][n];
		int [][] answer = new int[n][n];
		for (int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = input.nextInt();
				result[i][j] = 0;
				temp[i][j] = arr[i][j];
				answer[i][j] = 0;
			}
		}
		if (m==0){
			for (int i=0; i<answer.length; i++){
				answer[i][i]=1;
			}
			for (int i=0; i<answer.length; i++){
				for(int j=0; j<answer[i].length; j++){
					System.out.print(answer[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		int num = 0;
		for (int index=1; index<m; index++){
			for (int i=0; i<arr.length; i++){
				for(int j=0; j<arr[i].length; j++){
					for (int k =0; k<n; k++){
						//System.out.println(temp[i][k]+"------"+arr[k][j]);
						result[i][j]  = result[i][j]  + temp[i][k]*arr[k][j];
					}
				}
			}   
			for (int i=0; i<result.length; i++){
				for(int j=0; j<result[i].length; j++){
					temp[i][j] = result[i][j];
					answer[i][j] = result[i][j];
				//	System.out.print(result[i][j]+" ");
					result[i][j] = 0;
					
				}
				//System.out.println();
			}
		}
		
		for (int i=0; i<answer.length; i++){
			for(int j=0; j<answer[i].length; j++){
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
}
