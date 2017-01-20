package algo;

import java.util.Scanner;

public class Algo_092 {
	public static Scanner input  = new Scanner(System.in);
	public static String str = input.next();
	public static int num1 = input.nextInt();
	public static int num2 = input.nextInt();
	public static void main(String[] args) {
		switch (str){
			case "+":
				System.out.println(num1+num2);
				break;
			case "-":
				System.out.println(num1-num2);
				break;
			case "*":
				System.out.println(num1*num2);
				break;
			case "/":
				System.out.println(num1/num2);
				break;
		}
	}
}
