package algo;

import java.util.Scanner;

public class Algo_149 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int exponent = scanner.nextInt();
		
		for (int index = 1; index <= exponent; index++) {
			if(index % 5 != 0){
				System.out.printf("%12d",(int)Math.pow(num, index));
			}else{
				System.out.printf("%12d",(int)Math.pow(num, index));
				System.out.println();
			}
			
		}
	}
}
