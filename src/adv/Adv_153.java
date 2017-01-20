package adv;

import java.util.Scanner;

public class Adv_153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(digui(n,n));
	}

	private static int digui(int n, int m) {
		if(n<1 || m<1){
			return 0;
		}
		if(n==1 || m==1){
			return 1;
		}
		if(n<m){
			return digui(n,n);
		}
		if(n==m){
			return digui(n,m-1)+1;
		}
		return digui(n,m-1)+digui(n-m,n);
	}
}
