package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Algo_093 {
	public static int method(String str){
		String str1 = "";
		char [] ch = str.toCharArray();
		for (int i=ch.length-1; i>=0; i--){
			str1 = str1+ch[i];
		}
		return Integer.parseInt(str1);
	}
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bfr = new BufferedReader(isr);
		String str = bfr.readLine();
		String [] array = str.split(" ");
		
		String result = method(array[0])+method(array[1])+"";
		System.out.println(method(result));
	}
}
