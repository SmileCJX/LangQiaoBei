package adv;

import java.util.Scanner;

public class Adv_181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int primeFactors = 2;
		while(n!=1){
			if(n%primeFactors==0){
				System.out.print(primeFactors+" ");
				count++;
				n = n/primeFactors;
			}else{
				primeFactors++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
