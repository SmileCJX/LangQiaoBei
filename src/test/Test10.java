package test;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
//		for(int zhao=0; zhao<2; zhao++){
//			for(int qian=0; qian<2; qian++){
//				for(int sun=0; sun<2; sun++){
//					for(int li=0; li<2; li++){
//						if(zhao+qian>=1 && qian+sun>=1 && sun+li>=1 && zhao+sun<=1 && qian+li<=1){
//							System.out.println(zhao+" "+qian+" "+sun+" "+li);
//						}
//					}
//				}
//			}
//		}
		Scanner sc =new Scanner(System.in);
		String [] arr = sc.nextLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
