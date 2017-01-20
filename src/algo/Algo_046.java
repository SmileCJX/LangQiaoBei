package algo;

import java.util.Scanner;

public class Algo_046 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		System.out.println(method(n, m));
	}

	public static int method(int n, int m) {
		int n2 = n / m;
		if (n % m != 0) {
			n2++;
		}

		return (int)(Math.pow(2, n2)-1);
	}

}
