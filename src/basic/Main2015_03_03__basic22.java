package basic;

import java.util.Scanner;

public class Main2015_03_03__basic22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(method(input.nextInt()));
	}
	
	public static String method(int n){
		if(n==1){
			return "A";
		}else{
			return method(n-1)+(char)('A'+n-1)+method(n-1);
		}
	}
}
