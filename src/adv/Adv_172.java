package adv;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Adv_172 {
	public static void main(String[] args) {
		Map<String, String> map =new TreeMap<String, String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});  ;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = null;
		for(int i=0; i<n; i++){
			s = sc.next();
			map.put(s.substring(6,14), s);
		}
		Set set = map.keySet();
		Iterator<String> iterator =  set.iterator();
		while(iterator.hasNext()){
			String s1 = iterator.next();
			System.out.println(map.get(s1));
		}
	}
}
