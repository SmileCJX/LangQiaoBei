package basic;

import java.util.Scanner;

public class Main2014_12_13__basic_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String res = "";
		if (n==0){
			System.out.println("0");
			return;
		}
		while(n!=0){
			int temp = n%16;
			if (temp>=10){
				switch(temp){
					case 10:
						res = "A"+res;
						break;
					case 11:
						res = "B"+res;
						break;
					case 12:
						res = "C"+res;
						break;
					case 13:
						res = "D"+res;
						break;
					case 14:
						res = "E"+res;
						break;
					case 15:
						res = "F"+res;
						break;
				}
			}else{
				res = temp+res;
			}
			n = n/16;
		}
		System.out.println(res);
	}
}
