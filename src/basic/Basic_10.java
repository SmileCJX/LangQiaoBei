package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		int n = Integer.parseInt(s);
		
		System.out.println(Integer.toHexString(n).toUpperCase());
	}
}
