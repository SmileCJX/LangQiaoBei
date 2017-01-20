package algo;

import java.util.Scanner;

public class Algo_051 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int index = 0;
		int result =  1;
		int sum = 2;
		while(index<n){
			if (isPrime(sum)){
				result = (result*sum) % 50000;
				index++;
			}
			sum++;
		}
		System.out.println(result);
	}
	
	public static boolean isPrime(int sum){
		boolean flag = true;
		for (int i=2; i<=(int)Math.sqrt(sum); i++){
			if (sum % i == 0){
				flag = false;
			}
		}
		
		return flag;
	}
}
