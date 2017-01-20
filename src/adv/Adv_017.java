package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Adv_017 {
	public static LinkedHashMap <String,Integer> hm = new LinkedHashMap<String,Integer>();
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		str = str.replace(",","");
		str = str.replace(".","");
		//System.out.println(str);
		
		method(str);
		printAll();
	}
	
	public static void method(String str){
		if (!str.contains(" ")){
			hm.put(str,1);
			return;
		}
		String [] arr = new String[2];
		while(str.contains(" ")){
			arr = str.split(" ");
			Integer i = hm.get(arr[0].toUpperCase());
			if( i == null){
				hm.put(arr[0].toUpperCase(), 1);
			}else if( i != null){
				i++;
				hm.put(arr[0].toUpperCase(),i);
			}
			str = str.substring(arr[0].toUpperCase().length()+1);
		}
		Integer i = hm.get(arr[1].toUpperCase());
		if( i == null){
			hm.put(arr[1].toUpperCase(), 1);
		}else if( i != null){
			i++;
			hm.put(arr[1].toUpperCase(),i);
		}
	}
	
	public static void printAll(){
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str= it.next();
			Integer i = hm.get(str);
			System.out.print(str+":");
			for (int index=0; index<i; index++){
				System.out.print("*");
			}
			System.out.println(i);
		}
	}
}
