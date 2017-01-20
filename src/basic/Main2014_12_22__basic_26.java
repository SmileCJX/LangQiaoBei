package basic;

import java.util.Scanner;

public class Main2014_12_22__basic_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		method(n, m);
	}

	public static void method(int n, int m) {
		if (m==0){
			if (n / 10 == 0) {
				print1(n);
				System.out.print("o'clock");
				return;
			}else if(n/10!=0){
				if (n<=20){
					print2(n);
					System.out.print("o'clock");
					return;
				}else{
					print3(n/10);
					print1(n%10);
					System.out.print("o'clock");
					return;
				}
			}
		}
		if (n / 10 == 0) {
			print1(n);
		}else if(n/10!=0){
			if (n<=20){
				print2(n);
			}else{
				print3(n/10);
				print1(n%10);
			}
		}
		
		if (m / 10 == 0) {
			print1(m);
		}else if(m/10!=0){
			if (m<=20){
				print2(m);
			}else{
				print3(m/10);
				print1(m%10);
			}
		}
	}

	public static void print1(int i) {
		switch (i) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
		}
	}
	
	public static void print2(int i){
		switch (i) {
		case 11:
			System.out.print("eleven ");
			break;
		case 12:
			System.out.print("twelve ");
			break;
		case 13:
			System.out.print("thirteen ");
			break;
		case 14:
			System.out.print("fourteen ");
			break;
		case 15:
			System.out.print("fifteen ");
			break;
		case 16:
			System.out.print("sixteen ");
			break;
		case 17:
			System.out.print("seventeen ");
			break;
		case 18:
			System.out.print("eighteen ");
			break;
		case 19:
			System.out.print("nineteen ");
			break;
		case 20:
			System.out.print("twenty ");
		}
	}
	
	public static void print3(int i){
		switch (i) {
			case 2:
				System.out.print("twenty ");
				break;
			case 3:
				System.out.print("thirty ");
				break;
			case 4:
				System.out.print("forty ");
				break;
			case 5:
				System.out.print("fifty ");
				break;
		}
	}
}
