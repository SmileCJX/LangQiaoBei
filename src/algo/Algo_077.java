package algo;

import java.util.Scanner;

public class Algo_077 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		if (x2-x1==0){
			System.out.println("INF");
		}else{
			System.out.println((int)((y1-y2)/(x1-x2)));
		}
	}
}
