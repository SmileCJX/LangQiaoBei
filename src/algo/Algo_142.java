package algo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Algo_142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double b1 = sc.nextDouble();
		double b2 = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.00");
		switch (s) {
		case "+":
			System.out.println(df.format((a1+b1))+"+"+df.format((a2+b2))+"i");
			break;
		case "-":
			System.out.println(df.format((a1-b1))+"+"+df.format((a2-b2))+"i");
			break;
		case "*":
			System.out.println(df.format((a1*b1-a2*b2))+"+"+df.format((a1*b2+a2*b1))+"i");
			break;
		case "/":
			System.out.println(df.format((a1*b1+a2*b2)/(b1*b1+b2*b2))+"+"+df.format((a2*b1-a1*b2)/(b1*b1+b2*b2))+"i");
			break;
		default:
			break;
		}
	}
}
