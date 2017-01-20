package basic;

import java.util.Scanner;

public class Main2014_12_21__basic_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		char[] ch = new char[m];
		int num = 65;
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) num;
			num++;
		}
		// System.out.println(ch);

		char[][] charArr = new char[n][m];

		print(method(n, m, ch, charArr));

	}

	public static char[][] method(int n, int m, char[] ch, char[][] charArr) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				charArr[i + j][i] = ch[j];
			}
			for (int j = 1; j < m - i; j++) {
				charArr[i][i + j] = ch[j];
			}
		}
		return charArr;
	}

	public static void print(char[][] charArr) {
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.print(charArr[i][j]);
			}
			System.out.println();
		}
	}
}
