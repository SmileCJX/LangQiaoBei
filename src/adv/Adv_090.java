package adv;

import java.util.Calendar;

public class Adv_090 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2006,11,2);
		int dayNum = cal.get(Calendar.DAY_OF_WEEK)-1;
		//System.out.println(dayNum);
		System.out.println("Calendar 2006-12");
		System.out.println("--------------------------");
		System.out.println("Su Mo Tu We Th Fr Sa");
		System.out.println("--------------------------");
		for (int i=1; i<=(7-dayNum+1); i++){
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=(7-dayNum+1)+1; i<=31; i++){
			if ((i-2)%7!=0){
				System.out.print(i+" ");
			}else{
				System.out.print(i);
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("--------------------------");
	}
}
