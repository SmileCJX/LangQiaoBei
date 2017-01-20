package adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Adv_100 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		Scanner input = new Scanner(System.in);
		int n = 0;
		while ((n = input.nextInt()) != 0) {
			list.add(n);
		}
		Collections.sort(list);
		// System.out.println(list);
		System.out.println(list.get(list.size() - 2));
	}

}
