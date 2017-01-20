package algo;

import java.util.Scanner;

public class Algo_078 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		char [] arr = str.toCharArray();
		
		
		System.out.println(method(arr));
		
	}
	
	public static int method(char[] arr){
		for (int i=0; i<arr.length; i++){
			if (arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
				return i+1;
			}
		}
		return 0;
	}
}
