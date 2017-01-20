package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Algo_058 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String str = bfr.readLine();
		char [] ch = str.toCharArray();
		
		for (int i=ch.length-1; i>=0; i--){
			System.out.print(ch[i]);
		}
	}
}
