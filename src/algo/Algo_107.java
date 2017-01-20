package algo;

import java.util.LinkedList;
import java.util.Scanner;

public class Algo_107 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int sum1=0,sum2=0;
		Scanner sc = new Scanner(System.in); 
		
		for(int i=0; i<10; i++){
			list1.add(sc.nextInt());
			list2.add(sc.nextInt());
		}
		
		for (int i = 0; i < list1.size(); i++) {
			sum1 += list1.get(i);
			sum2 += list2.get(i);
		}
		
		System.out.println(sum1+"+"+sum2+"i");
	}
}
