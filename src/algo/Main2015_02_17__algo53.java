package algo;

import java.util.Arrays;
import java.util.Scanner;

public class Main2015_02_17__algo53 {
	public static Scanner input = new Scanner(System.in);
	public static int t = input.nextInt();
	public static int[] result = new int[t];
	public static int index = 0;
	public static void main(String[] args) {

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[n];
			for (int j = 0; j < n; j++) {
				arr1[j] = input.nextInt();
			}
			for (int j = 0; j < n; j++) {
				arr2[j] = input.nextInt();
			}
			method(arr1, arr2);
		}
		
		for (int i=0 ;i<result.length; i++){
			System.out.print(result[i]+" ");
		}
	}

	public static void method(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		/*
		 * for (int i=0; i<arr1.length; i++){ System.out.println(arr1[i]); }
		 * System.out.println("-----"); for (int i=0; i<arr2.length; i++){
		 * System.out.println(arr2[i]); }
		 */
		int num = 0;
		for (int i = 0; i < arr1.length; i++) {
			num = num + arr1[i] * arr2[arr1.length - i - 1];
			// System.out.println(result);
		}
		result[index] = num;
		index++;
	}
}
