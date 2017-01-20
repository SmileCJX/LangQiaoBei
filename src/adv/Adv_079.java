package adv;

import java.util.Scanner;

public class Adv_079 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int day = n / 1440;
		int hour = (n-day*1440) / 60;
		int minute = (n-day*1440-hour*60);
		System.out.println(day+" "+hour+" "+minute);
	}
}
