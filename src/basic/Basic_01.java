package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basic_01 {
	public static void main(String[] args) throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bfr.readLine());
		if((number%4==0 && number%100!=0) || (number%400==0)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
