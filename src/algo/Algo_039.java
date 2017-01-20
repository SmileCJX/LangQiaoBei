package algo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Algo_039 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		/*
		for (int i=0; i<arr.length-1; i++){
			for (int j=i+1; j<arr.length; j++){
				if (arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		*/
		
		Set<Integer> data = new HashSet<Integer>();
		for (int i : arr) {
			data.add(i);
		}
		
		TreeSet ts = new TreeSet(data);
		
		for (Object object : ts) {
			System.out.println(object);
		}
	}
}