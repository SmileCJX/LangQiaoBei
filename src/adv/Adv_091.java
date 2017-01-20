package adv;

import java.util.Scanner;

public class Adv_091 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(IsPrime(input.nextInt()));
	}
	
	public static String IsPrime(int n){
		for (int i=2; i<=(int)Math.sqrt(n); i++){
			if (n % i == 0){
				return "no";
			}
		}
		return "yes";
	}
}
