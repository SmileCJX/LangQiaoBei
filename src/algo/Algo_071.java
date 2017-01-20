package algo;

import java.util.Scanner;

public class Algo_071{
	private static Scanner input = new Scanner(System.in);
	private static String str1 = input.next();
	private static String str2 = input.next();
	private static int n = -1;
	public static void main(String[] args) {
		if (str1.equals(str2)){
			System.out.println("0");
		}else{
			while(true){
				n++;
				if(str1.charAt(n)==str2.charAt(n)){
					continue;
				}else{
					System.out.println(str1.charAt(n)-str2.charAt(n));
					break;
				}
			}
		}
	}
}