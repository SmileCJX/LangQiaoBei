package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_221 {
	public static final double PI = 3.1415926;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		System.err.println(calculateBallBulk(radius));
	}
	private static String calculateBallBulk(double radius) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00000");
		String result = decimalFormat.format(4.0/3.0*PI*Math.pow(radius, 3));
		return result;
	}
}
