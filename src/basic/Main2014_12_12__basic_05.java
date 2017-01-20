package basic;

import java.util.Scanner;

public class Main2014_12_12__basic_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] b = new int[n];
		for (int i=0; i<b.length; i++){
			b[i] = input.nextInt();
		}
		int a = input.nextInt();
		System.out.println(method(b,a));
		
	}
	
	public static int method(int[] b,int a){
		for (int i=0; i<b.length; i++){
			if (a == b[i]){
				return i+1;
			}
		}
		return -1;
	}
}
