package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Adv_016 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n+1];
		int [] d = new int[n+1];
		BufferedReader bfr = new  BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String [] s = str.split(" ");

		for (int i = 1; i < a.length; i++) {
			a[i] = Integer.parseInt(s[i-1]);
		}
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<a.length; i++){
			d[i] = Math.max(d[i-1]+a[i], 0);
			if(d[i] > max){
				max = d[i];
			}
		}
		
		System.out.println(max);
	}
}
