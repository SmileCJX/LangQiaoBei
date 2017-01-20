package basic;

import java.util.Scanner;

public class Main2015_02_14__basic11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int n = Integer.valueOf(str,16);
		System.out.println(n);
		System.out.println(Integer.MAX_VALUE);
	}
}
