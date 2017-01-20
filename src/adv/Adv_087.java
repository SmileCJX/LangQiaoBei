package adv;

import java.util.Scanner;

public class Adv_087 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double m = input.nextDouble();
		System.out.printf("%.2f",(m/100*0.8+1)*n);
	}
}
