package adv;

import java.util.Calendar;
import java.util.Scanner;

public class Adv_093 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(n,m-1,2);
		int dayNum = cal.get(Calendar.DAY_OF_WEEK)-1;
		//System.out.println(dayNum);
		System.out.println("Calendar "+n+"-"+(m<10?"0"+m:m+""));
		System.out.println("---------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		System.out.println("---------------------");
		for (int i=1; i<=(7-dayNum+1); i++){
			System.out.print(i+" ");
		}
		System.out.println();
		int index = 0;
		for (int i=(7-dayNum+1)+1; i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++){
			
			if (++index % 7 != 0){
				System.out.print(i+" ");
			}else{
				System.out.print(i);
				System.out.println();
			}
		}
		if ((cal.getActualMaximum(Calendar.DAY_OF_MONTH)-8+dayNum)%7!=0)
			System.out.println();
		System.out.println("---------------------");
	}
}
