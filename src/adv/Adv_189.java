package adv;
//推测范围大小，暴力解决

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adv_189 {
	public static void main(String[] args) {
		
		List<String> ansList = new ArrayList<String>();
		for (int i = 1; i < 99999; i++) {
			String fullPermutation = "";
			for (int n = 1; n < 10; n++) {
				fullPermutation = fullPermutation + String.valueOf( i*n );
				
				if( check(fullPermutation) ){
					ansList.add(fullPermutation);
				}
			}
		}
		
		Collections.sort(ansList);
		
		for(String s:ansList){
			System.out.println(s);
		}
	}

	private static boolean check(String fullPermutation) {
		int [] visit = new int[10];
		for (int i = 0; i < fullPermutation.length(); i++) {
			visit[ (byte)fullPermutation.charAt(i)-(byte)'0']++;
		}
		
		if(visit[0] > 0){
			return false;
		}
		
		for (int i = 1; i < visit.length; i++) {
			if(visit[i] != 1){
				return false;
			}
		}
		return true;
	}
}
