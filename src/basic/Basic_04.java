package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_04 {
	public static void main(String[] args) throws IOException {
		String str1 = null;
		String str2 = null;
		int sum = 0;
		int n = 0;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		str1 = bfr.readLine();
		n = Integer.parseInt(str1);
		
		str2 = bfr.readLine();
		String [] arr = str2.split(" ");
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++){
			arr2[i] = Integer.parseInt(arr[i]);
			sum += arr2[i];
		}
		
		Arrays.sort(arr2);
		System.out.println(arr2[n-1]);
		System.out.println(arr2[0]);
		System.out.println(sum);
	}
}
