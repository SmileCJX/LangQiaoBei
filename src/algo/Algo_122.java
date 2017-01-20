package algo;

import java.util.Scanner;

public class Algo_122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(method(m,n));
	}

	private static int  method(int m, int n) {
		if(m<n){
			return 0;
		}
		
		if(n==0){
			return 1;
		}
		return method(m-1,n)+method(m,n-1);
	}
}
