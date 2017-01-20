package adv;

import java.util.Arrays;
import java.util.Scanner;

public class Adv_131 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalNumber = scanner.nextInt();
		int [] sortNumbers = new int [totalNumber];
		for (int index = 0; index < sortNumbers.length; index++) {
			sortNumbers[index] = scanner.nextInt();
		}
		
		printSelectSortStep(sortNumbers);
	}

	private static void printSelectSortStep(int[] sortNumbers) {
		for (int i = 0; i < sortNumbers.length; i++) {
			int min = sortNumbers[i];
			int flag = i;
			for (int j = i; j < sortNumbers.length; j++) {
				if(sortNumbers[j] < min){
					min = sortNumbers[j];
					flag = j;
				}
			}
			sortNumbers[flag] = sortNumbers[i];
			sortNumbers[i] = min;
			System.out.println("swap(a["+i+"], a["+flag+"]):"+Arrays.toString(sortNumbers).replaceAll("[\\[\\],]", ""));
		}
	}
	
}
