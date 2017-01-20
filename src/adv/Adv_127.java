package adv;

import java.util.Calendar;
import java.util.Scanner;

public class Adv_127 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1,day);
		int weekday = cal.get(Calendar.DAY_OF_WEEK)-1;
		
		if (weekday!=0){
			System.out.println(weekday);
		}else{
			System.out.println(7);
		}
		
	}
}
