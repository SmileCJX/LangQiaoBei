package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Adv_198Fault {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(bfr.readLine()," ",false);
		StringTokenizer st2 = new StringTokenizer(bfr.readLine()," ",false);
		String [] str1 = new String[st1.countTokens()];
		str1 = method(st1);
		String [] copy = new String[st1.countTokens()];
		copy = method(st1);
		String [] str2 = new String[st2.countTokens()];
		str2 = method(st2);
		for(int i=0; i<str1.length; i++){
			char [] ca = str1[i].toCharArray();
		}
	}

	private static String[] method(StringTokenizer st1) {
		int i=0;
		String [] arr1 = new String[st1.countTokens()];
		while(st1.hasMoreElements()){
			arr1[i] = st1.nextToken();
			i++;
		}
		return arr1;
	}
}
