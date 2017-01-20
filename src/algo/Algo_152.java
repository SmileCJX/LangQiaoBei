package algo;

import java.util.ArrayList;
import java.util.List;

public class Algo_152 {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<Integer>();
		for (int i = 1; i < 9999; i++) {
			int temp = 0;
			
			for (int j = 1; j < i/2+1; j++) {
				if(i % j == 0){
					temp += j;
				}
			}
			
			if(temp == i){
				lists.add(i);
			}
		}
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}
}
