package adv;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Adv_083 {
	public static void main(String[] args) {
		int index = 0;
		for(int i=111; i<=333; i++){
			if (method(i)){
				System.out.println(i+" "+i*2+" "+i*3);
			}
		}
	}
	
	public static boolean method(int i){
		boolean flag = false;
	
	  
		int num1 = i;
		int num2 = i*2;
		int num3 = i*3;

		Set<Integer> set = new HashSet<Integer>();
		for (int index=0; index<3; index++){
			set.add(num1%10);
			set.add(num2%10);
			set.add(num3%10);
			num1 = num1/10;
			num2 = num2/10;
			num3 = num3/10;
		}
	/*	Iterator it = set.iterator();
		int index = 0;
		while(it.hasNext()){
			System.out.print(it.next());
			index++;
		}
		System.out.println();
		System.out.println(index);*/
		if (set.size()==9 && !set.contains(0)){
			flag = true;
		}
		return flag;
	}
}
