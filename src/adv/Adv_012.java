package adv;

import java.util.Scanner;

public class Adv_012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			method(input.nextInt());
		}
	}

	public static void method(int i) {
		String hour = "";
		String minute = "";
		String second = "";

		hour = (i / 3600) < 10 ? "0" + (i / 3600) : (i / 3600) + "";
		minute = ((i - i / 3600 * 3600) / 60) < 10 ? "0"
				+ ((i - i / 3600 * 3600) / 60) : ((i - i / 3600 * 3600) / 60)
				+ "";
		second = (i - (i / 3600) * 3600 - ((i - i / 3600 * 3600) / 60) * 60) < 10 ? "0"
				+ (i - (i / 3600) * 3600 - ((i - i / 3600 * 3600) / 60) * 60)
				: (i - (i / 3600) * 3600 - ((i - i / 3600 * 3600) / 60) * 60)
						+ "";
		System.out.println(hour + ":" + minute+":"+second);
	}
}
