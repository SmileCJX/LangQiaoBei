package algo;

import java.util.Scanner;

public class Algo_103 {
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();
	private static int sum = 0;
	public static void main(String[] args) {
		
		for (int i = 1; i <=n / 2; i++) {
			if (n %i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
