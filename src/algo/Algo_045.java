package algo;

import java.io.IOException;
import java.util.Scanner;

public class Algo_045 {
	public static void main(String[] args) throws IOException {
		/*
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String str = null;
		double n = 1;
		double sum = 0;
		while((str = bfr.readLine())!=null){
			if (Integer.valueOf(str) == 0.00){
				break;
			}
			int num = Integer.valueOf(str);
			//System.out.println(num);
			while(sum<num){
				n++;
				System.out.println(n);
				sum = sum + 1/n;
			}
			System.out.println((int)n);
			n = 1;
			sum = 0;
		}
		*/
		
		Scanner input = new Scanner(System.in);
		double num;
		double n = 1; 
		double sum = 0;
		while ((num = input.nextDouble() )!=0.00){
			while(sum<num){
				n++;
				//System.out.println(n);
				sum = sum + 1/n;
			}
			System.out.println((int)(n-1)+" card(s)");
			n = 1;
			sum = 0;
		}
	}
}
