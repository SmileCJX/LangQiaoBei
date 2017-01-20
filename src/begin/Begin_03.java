package begin;

import java.util.Scanner;

public class Begin_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Double r = input.nextDouble();
		System.out.printf("%.7f",Math.PI*r*r);
	}
}
