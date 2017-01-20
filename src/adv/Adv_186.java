package adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Adv_186 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=1; i<10000; i++){
			for(int j=1; j<i; j++){
				if(i*j>10000){
					break;
				}else if((i+""+j+""+i*j).length()==9){
					if(test(i,j,i*j)){
						list.add((i*j+" "+"="+" "+j+" "+"x"+" "+i));
					}
				}
			}
		}
		Collections.sort(list);
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

	private static boolean test(int i, int j,int result) {
		String s = i+""+j+""+result;
		char [] ch = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(int index=0; index<ch.length; index++){
			set.add(ch[index]);
		}
		if(!set.contains('0') && set.size()==9){
			return true;
		}
		return false;
	}
}
