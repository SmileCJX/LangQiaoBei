package algo;

import java.util.Scanner;

public class Algo_073 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char [] array = str.toCharArray();
		
		
		int count = 0;
		for (int i=0; i<array.length; i++){
			if (array[i]<='9' && array[i]>='0'){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
