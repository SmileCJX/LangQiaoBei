package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_081 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num*num+" "+df.format(Math.sqrt(num))+" "+df.format(1/(double)num));
	}
}
