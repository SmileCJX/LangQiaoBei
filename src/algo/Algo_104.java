package algo;

import java.util.Scanner;


public class Algo_104 {
	private static 	int result = 1;
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		System.out.println(method(n));
	}
	public static int method(long n){
		int temp = 0;
		result = 1;
		while(n!=0){
			temp = (int)(n % 10);
			if (temp!=0)
				result = temp * result;
			n = n/10;
		}
		if (result<10)
			return result;
		else
			return method(result);
	}
}
