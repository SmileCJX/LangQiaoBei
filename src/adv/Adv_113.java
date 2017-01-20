package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Adv_113 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		String str = bfr.readLine();
		StringTokenizer st = new StringTokenizer(str," ",false);
		String [] arr = new String[3];
		int i=0;
		while(st.hasMoreElements()){
			arr[i] = st.nextToken();
			i++;
		}
		switch (arr[2]) {
		case "+":
			System.out.println(Integer.valueOf(arr[0])+Integer.valueOf(arr[1]));
			break;
		case "-":
			System.out.println(Integer.valueOf(arr[0])-Integer.valueOf(arr[1]));
			break;
		case "*":
			System.out.println(Integer.valueOf(arr[0])*Integer.valueOf(arr[1]));
			break;	
		case "/":
			System.out.println(Integer.valueOf(arr[0])/Integer.valueOf(arr[1]));
			break;
		case "%":
			System.out.println(Integer.valueOf(arr[0])%Integer.valueOf(arr[1]));
			break;
		}
	}
}
