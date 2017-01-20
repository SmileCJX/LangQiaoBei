package algo;

import java.util.Scanner;

public class Algo_151 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		
		String s = Integer.toBinaryString(n);
		System.out.println(s.length());
	}
}
