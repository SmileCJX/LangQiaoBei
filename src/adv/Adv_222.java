package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_222 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println(arccos(x));
	}

	private static String arccos(double x) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00000");
		String result = decimalFormat.format(Math.acos(x));
		return result;
	}
}
