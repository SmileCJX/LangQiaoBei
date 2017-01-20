package algo;

import java.util.Scanner;

public class Algo_095{
	public static String [] arr = {
		"2(0)",
		"",//1≤ª”√ ‰≥ˆ
	    "2",//2
	    "2+2(0)",//3
	    "2(2)",//4
	    "2(2)+2(0)",//5
	    "2(2)+2",//6
	    "2(2)+2+2(0)",//7
	    "2(2+2(0))",//8
	    "2(2+2(0))+2(0)",//9
	    "2(2+2(0))+2",//10
	    "2(2+2(0))+2+2(0)",//11
	    "2(2+2(0))+2(2)",//12
	    "2(2+2(0))+2(2)+2(0)",//13
	    "2(2+2(0))+2(2)+2",//14
	    "2(2+2(0))+2(2)+2+2(0)"//15
	};
	
	public static String result = "";
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		String str = Integer.toBinaryString(n);
		//System.out.println(str);
		for (int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i));
			method(str.charAt(i),str.length()-i-1);
		}
		
		System.out.println(result.endsWith("+")? result.substring(0,result.length()-1):result.substring(0));
	}
	
	public static void method(char ch,int i){
		String s = "";
		if (ch!='0'){
			if (i==0){
				s = s+arr[i];
			}else if(i==1){
				s = s+2;
			}else {
				s = 2+"("+arr[i]+")";
			}
			if (i!=0){
				s = s+"+";
			}
		}
		result = result+s;
	}
}