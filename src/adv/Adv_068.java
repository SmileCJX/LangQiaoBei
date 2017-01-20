package adv;

import java.util.Scanner;

public class Adv_068 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		double welfare =0;
		if (money<=100000){
			welfare = money*0.1;
		}else if(money>100000 && money<=200000){
			welfare = 10000+(money-100000)*0.075;
		}else if(money>200000 && money<=400000){
			welfare = 17500+(money-200000)*0.05;
		}else if(money>400000 && money<=600000){
			welfare = 27500+(money-400000)*0.03;
		}else if(money>600000 && money<=1000000){
			welfare = 33500+(money-600000)*0.015;
		}else if(money>1000000){
			welfare = 39500+(money-1000000)*0.01;
		}
		System.out.printf("%.2f",welfare);
	}
}
