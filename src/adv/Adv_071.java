package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adv_071 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		
		String newstr = "";
		for (int i=str.length()-1; i>=0; i--){
			newstr = newstr+str.charAt(i);
		}
	
		if (str.equals(newstr)){
			System.out.println("yes!");
		}else{
			System.out.println("no!");
		}
	}
}
