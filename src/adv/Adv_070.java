package adv;

import java.util.Scanner;

public class Adv_070 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int[10];
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if (arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
