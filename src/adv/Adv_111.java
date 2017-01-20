package adv;

import java.util.Scanner;

public class Adv_111 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if (a == 0) {
			System.out.printf("%.2f", -(c / b));
		} else {
			double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			//System.out.println(Math.sqrt(b * b - 4 * a * c));
			double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (x1<x2){
				double temp = x1;
				x1 = x2;
				x2 = temp;
			}
			System.out.printf("%.2f",x1);
			System.out.printf(" %.2f",x2);
		}
	}
}
