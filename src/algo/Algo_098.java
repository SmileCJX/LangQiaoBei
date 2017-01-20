package algo;

import java.util.Scanner;

public class Algo_098{
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();

	public static void main(String[] args) {
		String s = Integer.toString(n);
		char [] ch = s.toCharArray();
		for (int i=0; i<ch.length; i++){
			System.out.print(ch[i]+" ");
		}
	}
}
