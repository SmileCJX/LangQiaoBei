package basic;

import java.util.Scanner;

public class Main2014_12_20__basic_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		method(n);
	}
	
	public static void method(int n){
		int hour = n/3600;
		int temp = n-n/3600*3600;
		int minute = temp/60;
		temp = temp-temp/60*60;
		int second = temp;
		System.out.println(hour+":"+minute+":"+second);
	}
}
