package algo;

import java.util.Arrays;
import java.util.Scanner;


public class Algo_091{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next().toLowerCase();
		String str2 = sc.next().toLowerCase();
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)){
			System.out.println("Y");
		}else{
			System.out.println("N");
		}
	}
}
//import java.util.Scanner;
//
//public class Algo_091{
//	private static Scanner input = new Scanner(System.in);
//	private static String str1 = input.next();
//	private static String str2 = input.next();
//	private static int sum1 = 0;
//	private static int sum2 = 0;
//	public static void main(String[] args) {
//		if (str1.length()==str2.length()){
//			for (int i=0; i<str1.length(); i++){
//				sum1 += (str1.toLowerCase().charAt(i));
//				sum2 += (str2.toLowerCase().charAt(i));
//			}
//			if (sum1==sum2){
//				System.out.println("Y");
//			}else{
//				System.out.println("N");
//			}
//		}else{
//			System.out.println("N");
//		}
//		
//		
//	}
//}