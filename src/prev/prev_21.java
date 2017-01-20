package prev;

import java.util.Scanner;

public class prev_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=10000;
		int index = 0;
		for (; i<1000000; i++){
			if (sum(i,n) && f(i)){
				System.out.println(i);
				index++;
			}
		}
		if (index==0){
			System.out.println(-1);
		}
		
	}
	
	public static boolean sum(int i,int n){
		int result = 0;
		while(i!=0){
			int temp = i%10;
			result += temp;
			i = i/10;
		}
		if (result == n){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean f(int i){
		String str = i+"";
		for (int index=0; index<str.length()/2; index++){
			if (str.charAt(index)!=str.charAt(str.length()-1-index)){
				return false;
			}
		}
		return true;
	}
}
