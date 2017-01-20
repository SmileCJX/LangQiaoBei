package adv;

import java.math.BigDecimal;
import java.util.Scanner;

public class Adv_197 {
	public static void main(String[] args) {
		BigDecimal a, b;
		Scanner cin = new Scanner(System.in);
		while (cin.hasNextBigDecimal()) {
			a = cin.nextBigDecimal();
			b = cin.nextBigDecimal();
			a = a.multiply(b);
			String str = a.toPlainString();
			System.out.println(str);
		}
	}
}
