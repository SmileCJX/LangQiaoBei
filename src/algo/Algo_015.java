package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algo_015 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		String [] arr = s.split(" ");
		Double d1 = Double.parseDouble(arr[0]);
		Double c = Double.parseDouble(arr[1]);
		Double d2 = Double.parseDouble(arr[2]);
		Double p = Double.parseDouble(arr[3]);
		int n = Integer.parseInt(arr[4]);
//		System.out.println(d1+" "+c+" "+d2+" "+p+" "+n);
	}
}
