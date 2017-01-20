package adv;

import java.util.Scanner;

public class Adv_223 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		devide(num);
	}

	private static void devide(int num) {
		StringBuffer buffer = new StringBuffer();
		devide(buffer,num,2);
		System.out.println(buffer.toString());
	}

	private static void devide(StringBuffer buffer, int num, int start) {
		boolean flag = false;
		int temp = num;
		for (int  i = start; i <= Math.sqrt(num); i++) {
			if(num % i == 0){
				buffer.append(i+"*");
				temp = num / i;
				start = i;
				flag = true;
				break;
			}
		}
		
		if(flag){
			devide(buffer,temp,start);
		} else {
			buffer.append(temp);
		}
	}
}
