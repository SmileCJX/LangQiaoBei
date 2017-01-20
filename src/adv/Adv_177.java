package adv;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Adv_177 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		double p = sc.nextDouble();
		double result = 0;
		for(int i=0; i<n; i++){
			result = (result+k) * (1+p);
		}
		System.out.printf("%.2f",result-n*k);
	}
}
