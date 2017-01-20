package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s = bfr.readLine();
		char [] ch = s.toCharArray();
		
		int num = ch.length; 
		long sum = 0;
		
		for(int i=0; i<num; i++){
			if((int)(ch[i]-48)>9){
				if(ch[i]=='A'){
					sum += 10*Math.pow(16, num-i-1);
				}else if(ch[i]=='B'){
					sum += 11*Math.pow(16, num-i-1);
				}else if(ch[i]=='C'){
					sum += 12*Math.pow(16, num-i-1);
				}else if(ch[i]=='D'){
					sum += 13*Math.pow(16, num-i-1);
				}else if(ch[i]=='E'){
					sum += 14*Math.pow(16, num-i-1);
				}else if(ch[i]=='F'){
					sum += 15*Math.pow(16, num-i-1);
				}
			}else{
				sum+=(int)(ch[i]-48)*Math.pow(16, num-i-1);
			}
		}
		
		System.out.println(sum);
	}
}
