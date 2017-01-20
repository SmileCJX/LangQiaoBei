package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_094 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println(df.format(a/Math.sqrt(a*a+b*b))+"+"+df.format(b/Math.sqrt(a*a+b*b))+"i");
	}
}
