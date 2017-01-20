package algo;
/*
 * Õ·×ªÏà³ý·¨
 */
import java.util.Scanner;

public class Algo_148 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int result = n*m/lcm(n,m);
		System.out.println(result);
	}

	private static int lcm(int n, int m) {
		int mod = n % m;
		while(mod != 0){
			n = m;
			m = mod;
			mod = n % m;
		}
		return m;
	}
}
