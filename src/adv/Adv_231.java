package adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Adv_231 {
	public static final Map<String,Integer> poker = new HashMap<String,Integer>();
	static{
		
		poker.put("2d", 1);
		poker.put("2c", 2);
		poker.put("2h", 3);
		poker.put("2s", 4);
		
		poker.put("3d", 5);
		poker.put("3c", 6);
		poker.put("3h", 7);
		poker.put("3s", 8);
		
		poker.put("4d", 9);
		poker.put("4c", 10);
		poker.put("4h", 11);
		poker.put("4s", 12);
		
		poker.put("5d", 13);
		poker.put("5c", 14);
		poker.put("5h", 15);
		poker.put("5s", 16);
		
		poker.put("6d", 17);
		poker.put("6c", 18);
		poker.put("6h", 19);
		poker.put("6s", 20);
		
		poker.put("7d", 21);
		poker.put("7c", 22);
		poker.put("7h", 23);
		poker.put("7s", 24);
		
		poker.put("8d", 25);
		poker.put("8c", 26);
		poker.put("8h", 27);
		poker.put("8s", 28);
		
		poker.put("9d", 29);
		poker.put("9c", 40);
		poker.put("9h", 31);
		poker.put("9s", 32);
		
		poker.put("0d", 33);
		poker.put("0c", 34);
		poker.put("0h", 35);
		poker.put("0s", 36);
		
		poker.put("Jd", 37);
		poker.put("Jc", 38);
		poker.put("Jh", 39);
		poker.put("Js", 40);
		
		poker.put("Qd", 41);
		poker.put("Qc", 42);
		poker.put("Qh", 43);
		poker.put("Qs", 44);
		
		poker.put("Kd", 45);
		poker.put("Kc", 46);
		poker.put("Kh", 47);
		poker.put("Ks", 48);
		
		poker.put("Ad", 49);
		poker.put("Ac", 50);
		poker.put("Ah", 51);
		poker.put("As", 52);
	}
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().replaceAll("10", "0");
		while (s != null) {
			list.add(s.substring(0,2));
			if(s.length()!=2){
				s = s.substring(2);
			} else{
				s = null;
			}
			
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				Integer i1 = poker.get(o1);
				Integer i2 = poker.get(o2);
				if(i1 == null || i2 == null){
					return 0;
				}
				return i1 - i2;
			}
		});
		
		System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
	}

}
