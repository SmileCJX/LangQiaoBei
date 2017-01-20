package adv;

import java.util.Scanner;

public class Adv_118 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("please input a number:\n");
		System.out.print("please input a string:\n");
		double d = sc.nextDouble();
		String s = sc.next();
		
		GetReal(d);
		GetString(s);
	}
	private static void GetString(String s) {
		System.out.println(s);
	}
	private static void GetReal(double d) {
		System.out.println(d);
	}
}
