package algo;

import java.util.Scanner;

public class Algo_061 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		
		if (x % 2==0){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
	}
}
