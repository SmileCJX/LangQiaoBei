package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] hex = new String[n];
		
		for (int i=0; i<hex.length; i++){
			hex[i] = sc.next();
		}
		
		for (int i=0; i<hex.length; i++){
			hexToOctal(hex[i]);
		}
	}

	public static void hexToOctal(String s) {
		String hexs = "0123456789ABCDEF";
		String octal = "01234567";
		
		String []hb = {"0000","0001","0010","0011","0100","0101","0110","0111",
				"1000","1001","1010","1011","1100","1101","1110","1111"}; 
		
		String []ob = {"000","001","010","011","100","101","110","111"};
		
		List<String> listtob = new ArrayList<String>();
		
		for (int i=0; i<ob.length; i++){
			listtob.add(ob[i]);
		}
		
		StringBuffer bstr = new StringBuffer();
		
		for (int i=0; i<s.length(); i++){
			int h = hexs.indexOf(s.charAt(i));
			bstr.append(hb[h]);
		}
		
		if(bstr.length()%3==1){
			bstr = bstr.insert(0, "00",0,2);
		}
		if(bstr.length()%3==2){
			bstr = bstr.insert(0, "0",0,1);
		}
		
		StringBuffer octalStr = new StringBuffer();
		
		for (int i=0; i<bstr.length(); i=i+3){
			String str = (String) bstr.subSequence(i, i+3);
			int num = listtob.indexOf(str);
			octalStr = octalStr.append(octal.charAt(num));
		}
		
		if(octalStr.charAt(0)=='0'){
			octalStr.deleteCharAt(0);
		}
		
		System.out.println(octalStr);
	}
}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String s1 = bfr.readLine();
		int n = Integer.parseInt(s1);
		
		int [] arr = new int[n];
		
		for (int i=0; i<n; i++){
			arr[i] = method(bfr.readLine());
		}
		
		for (int i=0; i<n; i++){
			System.out.println(Integer.toOctalString(arr[i]).toUpperCase());
		}
	}

	private static int method(String s) {
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
		return (int) sum;
	}
}
*/