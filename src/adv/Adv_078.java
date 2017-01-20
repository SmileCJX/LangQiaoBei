package adv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adv_078 {
	public static void main(String[] args) throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String max = "";
		String [] arr = null;
		while(str.contains(" ")){
			arr = str.split(" ");
			if (arr[0].length()>max.length()){
				max = arr[0];
			//	System.out.println(max);
			}
			str = str.substring(arr[0].length()+1);
			//System.out.println(str);
		}
		if (arr[1].length()>max.length()){
			max = arr[1];
		}
		System.out.println(max);
	}
}
