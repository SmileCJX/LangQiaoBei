package adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Adv_162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		Collections.sort(list);
		for (int i=0; i<n; i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1)+" "+list.get(0));
	}

}
