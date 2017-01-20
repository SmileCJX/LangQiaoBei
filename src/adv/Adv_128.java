package adv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adv_128 {
/*	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int r = input.nextInt();
		
		int num = 1;
		for (int i=2; i<=r; i++){
			if (method(i)){
				num++;
			}
		}
		
		System.out.println(num);
	}
	
	public static boolean method(int n){
		for (int i=2; i<=(int)(Math.sqrt(n)); i++){
			if (n % i == 0){
				return false;
			}
		}
		
		return true;
		
		if (Math.pow(2,n-1) % n == 1){
			return true;
		}
		return false;
	}*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int r = input.nextInt();
		
		List<Integer> primes = getPrimes(l,r);
		System.out.println(primes.size());
	}
	
	public static List<Integer> getPrimes(int l,int r){
		List<Integer> result = new ArrayList<Integer>();

		result.add(2);
		
		for (int i=3; i<=r; i+=2){
			if(!divisible(i,result)){
				result.add(i);
			}
		}
		
		return result;
	}
	
	public static boolean divisible(int n,List<Integer> primes){
		for  (Integer prime:primes){
			if (n % prime == 0){
				return true;
			}
			
			if (prime>=Math.sqrt(n)){
				break;
			}
		}
		
		return false;
	}
}
