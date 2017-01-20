package algo;

import java.util.Scanner;

public class Algo_023 {
	public static double [] ans = new double[3];
	public static double a,b,c,d;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		int num = -1;
		for(double i=-100.00; i<+200.00; i+=0.01){
			if(method(i) <= 1e-6 && num!=2){
				num++;
				ans[num] = i;
			}
		}
		for(int i=0; i<ans.length; i++){
			System.out.printf("%.2f ",ans[i]);
		}
	}
	
	public static double method(double i){
		double result = a*Math.pow(i, 3)+b*Math.pow(i, 2)+c*i+d;
		if(result<=0){
			result = -result;
		}
		return result;
	}
}
