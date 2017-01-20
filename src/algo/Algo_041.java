package algo;

import java.util.Scanner;

public class Algo_041 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		
		int sum = 0;
		int [][] arr = new int[n][m];
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++ ){
				arr[i][j] = input.nextInt();
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
