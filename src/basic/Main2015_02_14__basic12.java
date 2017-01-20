package basic;

import java.util.Scanner;

public class Main2015_02_14__basic12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String [] arr = new String[n];
		for(int i=0; i<n; i++){
			arr[i] = input.next();
		}
		for (int i=0; i<n; i++){
			method(arr[i]);
		}
	}
	
	public static void method(String num){
		int temp = Integer.parseInt(num,16);
		String str = Integer.toOctalString(temp);
		System.out.println(str);
	}
}
