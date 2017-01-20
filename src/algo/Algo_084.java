package algo;

import java.util.Scanner;

public class Algo_084 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		for (int i=0; i<str.length(); i++){
			method(str.charAt(i));
		}
	}
	
	public static void method(char ch){
		if ((ch>='a')&&(ch<='z')){
			System.out.print(Character.toUpperCase(ch));
		}else{
			System.out.print(Character.toLowerCase(ch));
		}
	}
}
