package adv;

import java.math.BigInteger;
import java.util.Scanner;

public class Adv_204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long p = sc.nextLong();
		
		long result = 1;
		n = n % p;
		while(m>0){
			if(m % 2 == 1){
				result = result * n % p;
			}
			m = m / 2;
			n = n * n % p;
		}
		System.out.println(result);
	}
}
