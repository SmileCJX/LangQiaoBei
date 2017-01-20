package algo;

import java.util.Scanner;

public class Algo_099 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int time = input.nextInt();
		double salary = input.nextDouble();
		
		if (time<=40){
			System.out.printf("%.2f",time*salary);
		}else if(time>40 && time<=50){
			System.out.printf("%.2f",(time-40)*salary*1.5+40*salary);
		}else if(time>50){
			System.out.printf("%.2f",(time-50)*salary*2+40*salary+10*salary*1.5);
		}
	}
}
