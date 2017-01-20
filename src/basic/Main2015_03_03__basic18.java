package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2015_03_03__basic18 {
	public static void main(String[] args) throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str1 = bfr.readLine();
		String str2 = bfr.readLine();
		String [] arr1 = str1.split(" ");
		String [] arr2 = str2.split(" ");
		int ax = Integer.parseInt(arr1[0]);
		int ay = Integer.parseInt(arr1[1]);
		int bx = Integer.parseInt(arr1[2]);
		int by = Integer.parseInt(arr1[3]);
		int cx = Integer.parseInt(arr2[0]);
		int cy = Integer.parseInt(arr2[1]);
		int dx = Integer.parseInt(arr2[2]);
		int dy = Integer.parseInt(arr2[3]);
		
		/*System.out.println(ax+" "+ay);
		System.out.println(bx+" "+by);
		System.out.println(cx+" "+cy);
		System.out.println(dx+" "+dy);*/
	}
}
