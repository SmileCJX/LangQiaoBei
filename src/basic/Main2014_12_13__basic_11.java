package basic;

import java.util.Scanner;

public class Main2014_12_13__basic_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		long result = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= '0') && (ch[i] <= '9')) {
				long temp = (int) (ch[i] - '0');
				result = result + temp
						* (int) (Math.pow(16, ch.length - i - 1));
			} else if ((ch[i] >= 'A') && (ch[i] <= 'F')) {
				long temp = (int) (ch[i] - 'A') + 10;
				result = result + temp
						* (int) (Math.pow(16, ch.length - i - 1));
			}
		}
		System.out.println(result);
		//System.out.println(Integer.MAX_VALUE);
	}
}
