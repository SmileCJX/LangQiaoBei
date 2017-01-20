package algo;

import java.util.Scanner;

public class Algo_081 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = new int[n];
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		method(arr);
	}
	
	public static void method(int [] arr){
		int sum = 0;
		int avg = 0;
		for (int i=0;i<arr.length; i++){
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println(sum+" "+avg);
	}
}
