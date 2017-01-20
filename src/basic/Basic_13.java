package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Basic_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		int n = Integer.parseInt(s);
		String s1 = bfr.readLine();
		String [] str = s1.split(" ");
		int [] collection = new int[n];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			al.add(Integer.parseInt(str[i]));
		}
		Collections.sort(al);
		for(int i=0; i<al.size(); i++){
			System.out.print(al.get(i)+" ");
		}
	}
}
