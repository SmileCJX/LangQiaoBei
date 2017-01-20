package prev;

import java.math.BigInteger;
import java.util.Scanner;

public class Prev_29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		BigInteger p = sc.nextBigInteger();
		
		long i = 2;
		BigInteger [] sum = new BigInteger[(int) n];
		sum[0] = new BigInteger("1");
		sum[1] = new BigInteger("1");
		
		long flag = n>m? n:m;
		
		while(i<flag){
			sum[(int) i] = sum[(int) (i-1)].add(sum[(int) (i-2)]);
			i++;
		}
		
		BigInteger result = new BigInteger("0");
		
		for (long index=0; index<n; index++){
			result = result.add(sum[(int) index]).remainder(sum[(int) (m-1)]);
		}
		
		System.out.println(result.remainder(sum[(int) (m-1)]).remainder(p));
	}
}
