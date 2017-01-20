package algo;

import java.util.Scanner;

public class Algo_117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int m1 = isFriend(n);
		int n1 = isFriend(m);
		if(n==n1 && m==m1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

	private static int isFriend(int n) {
		int temp = 0;
		for(int i=1; i<=n/2; i++){
			if(n % i == 0){
				temp += i;
			}
		}
		return temp;
	}
}
