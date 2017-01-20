package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_03 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String [] s = str.split(" ");
		char [] c = new char[Integer.parseInt(s[1])];
		int time = 0;
		int timeMax = Integer.parseInt(s[0]);
		
		for(int i=0; i<c.length; i++){
			c[i] =(char)('B'+i);
		}
//		System.out.println(c);
		for(int i=0; i<timeMax; i++){
			for(int j=0; j<c.length; j++){
				if(j<time){
					c[j] = (char)(c[j]+1);
				}else{
					c[j] = (char)(c[j]-1);
				}
			}
			time++;
			System.out.println(c);
		}
	}
}
