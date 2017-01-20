package algo;

import java.util.Scanner;

public class Algo_115 {
	
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int[] array = new int[input];
		
		for (int index = 0; index < array.length; index++) {
			array[index] = scanner.nextInt();
		}
		
		int t = scanner.nextInt();
		
		findAns(input-1,0,0,t);
	}

	private static void findAns(int aIndex, int bIndex, int sum,int t) {
		if( aIndex < 0 ){
			return;
		}
		
		
		findAns(aIndex-1, bIndex, sum, t);
	}
}
