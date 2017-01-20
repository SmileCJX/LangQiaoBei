package algo;

import java.util.Scanner;

public class Algo_106 {
	public static Scanner input = new Scanner(System.in);
	public static String str = input.next();
	public static int index = 0;
	public static void main(String[] args) {
		char [] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++){
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i'||  ch[i]=='o'|| ch[i]=='u'){
				index = i+1;
				break;
			}
		}
		System.out.println(index);
	}
}
