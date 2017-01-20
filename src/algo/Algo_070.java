package algo;

import java.util.Scanner;

public class Algo_070 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] str = new String[5];
		for (int i=0; i<str.length; i++){
			str[i] = input.next();
		}
		
		String max = "";
		for (int i=0; i<str.length; i++){
			if (str[i].length() > max.length()){
				max = str[i];
			}
		}
		System.out.println(max);
	}
}
