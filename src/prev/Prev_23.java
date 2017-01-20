package prev;

import java.util.Scanner;

public class Prev_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long t = sc.nextLong();
		
		int sum = 0;
		int num = 0;
		for(int i=0; t>0; i+=n){
			num = (1+i)*i/2 + 1;
			sum += num % k;
			t--;
		}
		System.out.println(sum);
	}

}
