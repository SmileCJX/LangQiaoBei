package algo;

import java.util.Scanner;

public class Algo_069{
	private static Scanner input = new Scanner(System.in);
	private static String  str = input.next();

	public static void main(String[] args) {
		char [] ch = str.toCharArray();
		for (int i=ch.length-1; i>=0; i--){
			System.out.print(ch[i]);
		}
	}
}
