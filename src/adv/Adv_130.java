package adv;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Adv_130 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String[n];
		for(int i=0; i<n; i++){
			str[i] = sc.next();
		}
		
		int max = Integer.MIN_VALUE;
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		for(int i=0; i<n; i++){
			Integer integer = hm.get(str[i]);
			if(integer == null){
				hm.put(str[i], 1);
			}else if(integer != null){
				integer++;
				if(max<integer){
					max = integer;
				}
				hm.put(str[i], integer);
			}
		}
		
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			Integer num = hm.get(s);
			if(num == max){
				System.out.println(s);
			}
		}
	}
}
