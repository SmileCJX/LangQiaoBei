package algo;

import java.util.Scanner;

public class Algo_100 {

	public static void main(String[] args) {
		/*
		 * InputStream is = System.in; InputStreamReader isr = new
		 * InputStreamReader(is); BufferedReader bfr = new BufferedReader(isr);
		 * int min = Integer.valueOf(bfr.readLine()); int max =
		 * Integer.valueOf(bfr.readLine()); int factor =
		 * Integer.valueOf(bfr.readLine()); while(min<=max){ if (min % factor ==
		 * 0){ System.out.print(min+" "); } min++; }
		 */
		Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		int max = input.nextInt();
		int factor = input.nextInt();
		int i = min;
		while (min <= max) {
			if (min % factor == 0) {
				System.out.print(min + " ");
			}
			min++;
		}

	}
}