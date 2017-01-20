package adv;

import java.math.BigInteger;
import java.util.Scanner;

//TODO
public class Adv_219 {
	
	public static final BigInteger mod = new BigInteger(987654321+"");
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		System.err.println(calculate(n,m));
	}

	private static BigInteger calculate(int n, int m) {
		BigInteger temp = BigInteger.ZERO;
		BigInteger result = BigInteger.ZERO;
		
		for (int index = 0; index <= n; index++) {
			BigInteger cube = new BigInteger(index+"").pow(3);
			temp = combination(n,m).multiply( combination(n, index) ).multiply(cube).mod(mod);
			result = result.add(temp).mod(mod);
		}
		return result;
	}

	private static BigInteger combination(int n, int m) {
		BigInteger result = BigInteger.ONE;
		result = rank(n).divide( rank(m) ).divide( rank(n-m) );
		return result;
	}
	
	public static BigInteger rank(int number){
		BigInteger sum = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			sum = sum.multiply(new BigInteger(i+"")).mod(mod);
		}
		return sum;
	}
}
