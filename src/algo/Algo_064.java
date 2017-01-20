package algo;

import java.util.Scanner;

public class Algo_064{
	private static Scanner input = new Scanner(System.in);
	private static String str = input.next();
	public static void main(String[] args) {
		if (str.charAt(0)<='z' && str.charAt(0)>='a'){
			System.out.println("lower");
		}else{
			System.out.println("upper");
		}
	}
}
