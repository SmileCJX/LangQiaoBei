package adv;

import java.util.Scanner;

public class Adv_135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double s = (double)(a+b+c)/(double)(2);
		System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}
