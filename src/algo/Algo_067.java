package algo;

import java.util.Scanner;

public class Algo_067 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[11];
		for (int i=0; i<11; i++){
			array[i] = input.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<array.length; i++){
			if (array[i]>max){
				max = array[i];
			}
			
			if (array[i]<min){
				min = array[i];
			}
		}
		
		System.out.println(max+" "+min);
	}
}
