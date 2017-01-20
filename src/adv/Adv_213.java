package adv;

import java.util.Scanner;

public class Adv_213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		double tax = sc.nextDouble();
		System.out.printf("%.2f",money*(1+tax/100*0.95));
		System.out.println();
		System.out.println(money*(1+tax/100*0.95));
	}
}
