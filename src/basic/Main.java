package basic;
/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int [][] ary = getTriangle(num);
		
		print(ary);
	}
	public static int  [][] getTriangle(int num){
		int [][] ary = new int [num][num];
		
		for (int i=0; i<ary.length; i++){
			ary[i][0] = 1;
			ary[i][i] = 1;
		}
		
		for (int i=1; i<ary.length; i++){
			for (int j = 1; j<=i; j++){
				ary [i][j] = ary[i-1][j-1] +ary[i-1][j];
			}
		}
		return ary;
	}
	public static void print(int [][] ary){
		for (int i=0; i<ary.length; i++){
			for (int j=0; j<=i; j++){
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
	}
}
