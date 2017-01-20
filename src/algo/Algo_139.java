package algo;

import java.util.Scanner;

public class Algo_139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.indexOf(0)=='0'){
			s = s.substring(s.length());
		}
		int n = Integer.parseInt(s);

		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();
		sb.append("0");

		while(n != 0){
			for(int i=0; i<sb.length(); i++){
				if(sb.charAt(i) == '0'){
					result.append("1");
				}else if(sb.charAt(i) == '1'){
					result.append("01");
				}
			}
			sb = new StringBuffer(result);
			result = new StringBuffer("");
			n--;
		}
		System.out.println(result);
	}
	
}

