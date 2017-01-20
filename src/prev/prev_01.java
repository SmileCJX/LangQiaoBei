package prev;

import java.util.Scanner;

public class prev_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int result = method(method(a,b),c);
		
		System.out.println(result);
	}
	
	public static int method(int a,int b){
		int r = a,s = a,t = b;
		if (a<b){
			r = a;
			a = b;
			b = r;
		}
		
		while(r!=0){
			r = a % b;
			a = b;
			b = r;
		}
		
		return s*t/a;
	}
}
