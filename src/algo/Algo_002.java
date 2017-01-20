package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo_002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(bfr.readLine());
		long result = 0;
		
		if(n==1){
			System.out.println(1);
			return;
		}
		
		if(n==2){
			System.out.println(2);
			return;
		}
		
		if(n%2==0){
			result = n%3!=0? (n*(n-1)*(n-3)):((n-1)*(n-2)*(n-3));
		}else{
			result = n*(n-1)*(n-2);
		}
		
		System.out.println(result);
	}
}
