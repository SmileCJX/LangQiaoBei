package basic;

import java.util.Scanner;

public class Main2014_12_20__basic_16 {
	public static void main(String[] args) {
		//long begin = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		for (int i=a; i<=b; i++){
			method(i);
			System.out.println();
		}
		//long end = System.currentTimeMillis();
		//System.out.println(end-begin);
	}
	
	public static void method(int n){
		int i=2;
		System.out.print(n+"=");
		while(true){
			if (n==i){
				System.out.print(i);
				break;
			}else if(n%i==0){
				System.out.print(i+"*");
				n = n/i;
				continue;
			}else{
				i+= i==2?1:2;
			}
		}
	}
}
