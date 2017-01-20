package basic;



/*
 * 问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
样例输入
52
样例输出
899998
989989
998899
数据规模和约定
　　1<=n<=54。
 */

/*
 * 		for (int i=10; i<99; i++){
			if (method1(i,n)){
				System.out.println(i);
			}
		}
	}
	public static boolean method1(int i,int n){
		for (int j=0; j<10; j++){
			int temp = i*1000+j*100+i%10*10+i/10;
			if (n==temp){
				return true;
			}
		}
		return false;
 */
import java.util.Scanner;
public class Main2014_12_12__02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i=10000; i<=999999; i++){
			if (sum(i,n)&&huiwen(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean sum(int i,int n){
		String s = String.valueOf(i);
		int result = 0;
		for (int j=0; j<s.length();j++){
			result +=s.charAt(j)-48;
		}
		return result==n;
	}
	
	public static boolean huiwen(int i){
		String str = trans(i);
		for (int j=0; j<str.length(); j++){
			if (str.charAt(j)!=str.charAt(str.length()-1-j)){
				return false;
			}
		}
		return true;
	}
	
	public static String trans(int i){
		int a = i;
		String res = "";
		while(a!=0){
			int b = a % 10;
			res = b+res;
			a = a/10;
		}
		return res;
	}
}
