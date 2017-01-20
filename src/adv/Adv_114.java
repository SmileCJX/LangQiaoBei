package adv;

import java.util.Scanner;

public class Adv_114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		switch (number1-number2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		case -1:
			System.out.println(-1);
			break;
		case 2:
			System.out.println(-1);
			break;
		case -2:
			System.out.println(1);
			break;
		default:
			break;
		}
	}
}
