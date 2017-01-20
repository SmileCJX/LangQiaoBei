package adv;

import java.util.Scanner;

public class Adv_184{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean [] primes = new boolean[n+1];
		primes[0] = true;
		primes[1] = true;
		
		for (int i = 2; i < primes.length; i++) {
			if(!primes[i]){
				for (int j = i*2; j < primes.length; j=j+i) {
					primes[j] = true;
				}
			}
		}
		
		long sum = 0;
		for (int i = 0; i < primes.length; i++) {
			if(!primes[i]){
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
//import java.util.Scanner;
//
//public class Adv_184 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i=2; i<=n; i++){
//			if(prime(i)){
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//	}
//
//	private static boolean prime(int num) {
//		for(int i=2; i<=(int)Math.sqrt(num); i++){
//			if(num % i == 0){
//				return false;
//			}
//		}
//		return true;
//	}
//
//}

