package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Basic_09 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		int n = Integer.parseInt(s);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		

		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++){
				for (int k=0; k<10; k++){
					if ((2*i+2*j+k)==n){
						al.add(10000*i+1000*j+100*k+10*j+i);
					}
					
					if((2*i+2*j+2*k)==n){
						al.add(100000*i+10000*j+1000*k+100*k+10*j+i);
					}
				}
			}
		}
		
		Collections.sort(al);
		
		for (int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}

/*import java.util.Scanner;
public class Basic_09{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i=10000; i<=999999; i++){
			if (sum(i,n)&&huiwen(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean sum(int i,int n){
		String s = String.valueOf(i);
		int result = 0;
		for (int j=0; j<s.length();j++){
			result +=s.charAt(j)-48;
		}
		return result==n;
	}
	
	public static boolean huiwen(int i){
		String str = trans(i);
		for (int j=0; j<str.length(); j++){
			if (str.charAt(j)!=str.charAt(str.length()-1-j)){
				return false;
			}
		}
		return true;
	}
	
	public static String trans(int i){
		int a = i;
		String res = "";
		while(a!=0){
			int b = a % 10;
			res = b+res;
			a = a/10;
		}
		return res;
	}
}*/
