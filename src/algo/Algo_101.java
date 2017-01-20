package algo;

import java.util.Scanner;

public class Algo_101 {
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();
	public static void main(String[] args) {
		for (int i=n; i>0; i--){
			for (int j=0; j<i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}