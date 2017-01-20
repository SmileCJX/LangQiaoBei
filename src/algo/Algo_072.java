package algo;

import java.util.Scanner;

public class Algo_072{
	private static Scanner input = new Scanner(System.in);
	private static double n = input.nextDouble();
	public static void main(String[] args) {
		switch ((int)(n)/10){
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("E");
				break;
		}
	}
}