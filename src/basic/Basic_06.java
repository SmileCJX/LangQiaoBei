package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_06 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		int n = Integer.parseInt(s);
		int [][] arr = getTriangle(n);
		
		for (int i=0; i<n; i++){
			for (int j=0; j<=i; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] getTriangle(int n) {
		int [][] arr = new int[n][n];
		
		for (int i=0; i<n; i++){
			arr[i][0] = 1;
			arr[i][i] = 1;
		}
		
		for (int i=1; i<arr.length; i++){
			for (int j=1; j<i+1; j++){
				arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
			
		return arr;
	}
}
