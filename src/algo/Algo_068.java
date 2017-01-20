package algo;

import java.util.Scanner;

public class Algo_068 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		for (int i=0; i<str.length(); i++){
			if ((str.charAt(i)>'9') || (str.charAt(i)<'0')){
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}
