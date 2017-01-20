package adv;

import java.util.Scanner;

public class Adv_095 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		System.out.println(strcmp(str1, str2));
	}

	public static int strcmp(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		if (str1.equals(str2)) {
			return 0;
		} else {

			int minIndex = ch1.length > ch2.length ? ch2.length : ch1.length;
			for (int i = 0; i < minIndex; i++) {
				if (ch1[i] > ch2[i]) {
					return 1;
				} else if (ch1[i] < ch2[i]) {
					return -1;
				}
			}
		}
		if (ch1.length > ch2.length) {
			return 1;
		} else {
			return -1;
		}
	}
}
