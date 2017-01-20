package algo;

import java.util.Scanner;

public class Main2015_01_03__algo02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		
		long result = 0;
		if (n==1){
			System.out.println(1);
		}
		
		if (n==2){
			System.out.println(2);
		}
		
		if (n%2==0){
			result = n%3!=0?(n*(n-1)*(n-3)):((n-1)*(n-2)*(n-3));
		}else {
			result = n*(n-1)*(n-2);
		}
		System.out.println(result);
	}
}
