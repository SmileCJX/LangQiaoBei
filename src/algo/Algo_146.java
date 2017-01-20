package algo;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Algo_146 {
	public static void main(String[] args) {
		final Integer FACTOR = 11*17;
		List<Integer> list = new ArrayList<>();
		
		int index = 1;
		while ((FACTOR*index) <= 1000) {
			list.add(FACTOR*index);
			index++; 
		}
		for (Integer num:list) {
			System.out.println(num);
		}
	}
}
