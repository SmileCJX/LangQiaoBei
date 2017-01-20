package basic;

import java.util.Scanner;

public class Main2014_12_15__basic_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		rev(ch1);
		rev(ch2);
		// System.out.println(ch1);
		// System.out.println(ch2);
		// System.out.println("===============");

		method(ch1, ch2);
	}

	public static void method(char[] ch1, char[] ch2) {
		int len = ch1.length > ch2.length ? ch2.length : ch1.length;
		int[] ch = new int[ch1.length < ch2.length ? ch2.length + 1
				: ch1.length + 1];
		int result1 = 0, result2 = 0, i, j;
		int temp = 0;
		for (i = 0; i < len; i++) {
			result1 = ch1[i] - '0';
			result2 = ch2[i] - '0';
			ch[i] = (result1 + result2 + temp) % 10;
			temp = (result1 + result2 + temp) / 10;
		}
		// System.out.println(i+"........"+temp);

		if (ch1.length >= ch2.length) {
			for (j = i; j < ch1.length; j++) {
				result1 = ch1[j] - '0';
				ch[j] = (result1 + temp) % 10;
				temp = (result1 + temp) / 10;
				// System.out.println(ch[j]);
			}
			if (temp != 0) {
				ch[j] = 1;
			}
		} else {
			for (j = i; j < ch2.length; j++) {
				result2 = ch2[j] - '0';
				ch[j] = (result2 + temp) % 10;
				temp = (result2 + temp) / 10;
				// System.out.println(ch[j]);
			}
			if (temp != 0) {
				ch[j] = 1;
			}
		}
		if (temp == 0) {
			for (i = ch.length - 2; i >= 0; i--) {
				System.out.print(ch[i]);
			}
		} else {
			for (i = ch.length - 1; i >= 0; i--) {
				System.out.print(ch[i]);
			}
		}

		/*
		 * int i,temp=0; int result1=0,result2 = 0;
		 * 
		 * if (ch1.length>ch2.length){ int [] array = new int[ch1.length]; for
		 * (i=0; i<=ch1.length; i++){ result1 = ch1[i]-'0';
		 * 
		 * if (i<=ch2.length){ result2 = ch2[i]-'0'; }
		 * 
		 * array[i] = result1+result2+temp; } result2 = 0; for(i=0;
		 * i<array.length; i++){ System.out.print(array[i]); } }
		 */
	}

	public static char[] rev(char[] ch) {
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;
		}

		return ch;
	}

}
