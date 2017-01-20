package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double d = Math.pow(1.1,sc.nextInt());
		System.out.println(df.format(d));
	}
}
