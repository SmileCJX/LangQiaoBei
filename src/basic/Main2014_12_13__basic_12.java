package basic;

import java.util.Scanner;

public class Main2014_12_13__basic_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] str  = new String[n];
		for (int i=0; i<str.length; i++){
			str[i] = input.next();
		}
		for (int i=0; i<str.length; i++){
			method(str[i]);
		}
	}
	
	public static void method(String str){
		char[] ch = str.toCharArray();
		int result = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= '0') && (ch[i] <= '9')) {
				int temp = (int) (ch[i] - '0');
				result = result + temp
						* (int) (Math.pow(16, ch.length - i - 1));
			} else if ((ch[i] >= 'A') && (ch[i] <= 'F')) {
				int temp = (int) (ch[i] - 'A') + 10;
				result = result + temp
						* (int) (Math.pow(16, ch.length - i - 1));
			}
		}
		//System.out.println(result);
		
		String res = "";
		while(result!=0){
			int temp = result%8;
			res = temp+res;
			result = result/8;
		}
		System.out.println(res);
	}
}
