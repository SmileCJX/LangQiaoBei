package algo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Algo_090 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		if (n <= 0) {
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			Integer in = hm.get(arr[i]);

			if (in == null) {
				hm.put(arr[i], 1);
			} else if (in != null) {
				in++;
				hm.put(arr[i], in);
			}
		}

		int max = 0;
		int result = 0;
		Set<Integer> set = hm.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer in = it.next();
			Integer i = hm.get(in);
			if (max < i) {
				max = i;
				result = in;
			}
		}
		System.out.println(result);
	}
}
