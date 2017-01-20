package adv;

import java.util.Scanner;

public class Adv_075 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		int n = input.nextInt();
		int m = input.nextInt();
		switch (str){
		case "+":
			System.out.println(n+m);
			break;
		case "-":
			System.out.println(n-m);
			break;
		case "*":
			System.out.println(n*m);
			break;
		case "/":
			System.out.println(n/m);
			break;
		}
	}
}
