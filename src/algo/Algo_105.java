package algo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Algo_105 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		method(year);
	}
	
	public static void method(int year){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		int sum = 0;
		for (int i=0; i<12; i++){
			cal.set(year, i,13);
			if (5==(cal.get(Calendar.DAY_OF_WEEK)-1)){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
