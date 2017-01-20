package prev;

import java.util.Scanner;

public class prev_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		char [] ch1  = str1.toCharArray();
		char [] ch2  = str2.toCharArray();
		int sum = 0;
		for (int i=0; i<str1.length(); i++){
			if (ch1[i]!=ch2[i]){
				function(ch1,ch2,i);
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static void function(char[] ch1,char[] ch2, int i){
		if (ch1[i]=='*'){
			ch1[i] = 'o';
		}else if(ch1[i] == 'o'){
			ch1[i] = '*';
		}
		
		if (ch1[i+1]=='o'){
			ch1[i+1] = '*';
		}else if(ch1[i+1]=='*'){
			ch1[i+1] = 'o';
		}
	}
}
