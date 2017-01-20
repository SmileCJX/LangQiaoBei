package basic;

import java.util.Scanner;

public class Main2014_12_20__basic_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();

		method(str1, str2);
	}

	public static void method(String str1, String str2) {
		int temp = 0;
		if (str1.length() != str2.length()) {
			System.out.println(1);
		} else if (str1.length() == str2.length()) {
			if (str1.equals(str2)) {
				System.out.println(2);

			}else if (str1.equalsIgnoreCase(str2)) {
				System.out.println(3);

			} else {
				System.out.println(4);
			}
		}

	}
}
