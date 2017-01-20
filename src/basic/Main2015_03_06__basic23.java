package basic;

import java.util.Scanner;

public class Main2015_03_06__basic23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int [] count = new int[n]; 
		int [][] arr = new int[n][n];
		
		for (int i=0; i<arr.length;i++){
			for (int j=0; j<arr[i].length; j++){
				arr[i][j] = input.nextInt();
				if (arr[i][j] == 1){
					count[j]++;
				}
			}
		}
		
		for (int i=0; i<n; i++){
			if (count[i]>(n/2)){
				System.out.print(i+1+" ");
			}
		}
	}
}
