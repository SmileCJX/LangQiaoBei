package algo;

import java.util.Scanner;

public class Algo_033 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int n = input.nextInt();
		String str = Integer.toBinaryString(n);
		//System.out.println(str);
		char [] arr = str.toCharArray();
		int [] array =new  int[arr.length];
		for (int i=0; i<arr.length; i++){
			array[i] = arr[i]-'0';
			//System.out.println(array[i]);
		}
		//System.out.println(Integer.MAX_VALUE);
		long sum = 0;
		for (int i=arr.length-1; i>=0; i--){
			sum += array[arr.length-i-1]*(int)(Math.pow(k, i));
		}
		System.out.println(sum);
	}
}
