package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Basic_05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bfr.readLine());
		String str = bfr.readLine();
		String [] s = str.split(" ");
		String s2 = bfr.readLine();
		int x = Integer.parseInt(s2);
		int [] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(s[i]);
		}
		for(int i=0; i<n; i++){
			if(i==(n-1) &&  x!=a[n-1]){
				System.out.println(-1);
				break;
			}
			if(x==a[i]){
				System.out.println(i+1);
				break;
			}
		}
	}
}
