package algo;

import java.util.Scanner;

public class Algo_150 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		System.out.println(dugui(k,n));
	}

	private static int dugui(int k, int n) {
		if(k==0 || k==n){
			return 1;
		}
		return dugui(k, n-1)+dugui(k-1, n-1);
	}

}
