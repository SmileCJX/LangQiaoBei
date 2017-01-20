package algo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Algo_111 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		
		Set<Integer> set = new TreeSet<Integer>();
		for (int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		
		System.out.println(set.size());
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
