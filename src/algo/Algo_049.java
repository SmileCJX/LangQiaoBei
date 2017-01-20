package algo;

import java.util.Scanner;

public class Algo_049 {
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();
	private static int [] a = new int [n];
	private static int max = 0; 
	private static int index = 0; 
	public static void main(String[] args) {
		for (int i=0;i<a.length; i++){
			a[i] = input.nextInt();
		}
		for (int i=0; i<a.length; i++){
			if (a[i]>max){
				max = a[i];
				index = i;
			}
		}
		System.out.println(max+" "+index);
	}
}
