package algo;

import java.util.Scanner;

public class Algo_079{
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();
	private static int [] arr = new int[n];
	private static int sum = 0;
	private static int [] arr1 = new int[n];
	private static int num = 0;
	public static void main(String[] args) {
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		for (int i=0; i<arr.length; i++){
			if (arr[i]!=0){
				sum++;
				arr1[num++] = arr[i];
			}
		}
		System.out.println(sum);
		int i=0;
		while(arr1[i]!=0){
			System.out.print(arr1[i]+" ");
			i++;
		}
	}
}