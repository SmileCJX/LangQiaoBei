package adv;

import java.util.Scanner;

public class Adv_214 {
	public static final double PI = 3.1415926536;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf( "%20.10f%20.10f%20.10f",PI*r*r,4*PI*r*r,4*PI*r*r*r/3);
	}
}
