package adv;

import java.util.Scanner;

public class Adv_082 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		System.out.printf("%.1f",Math.PI*r*r+2*Math.PI*r*2);
	}
}
