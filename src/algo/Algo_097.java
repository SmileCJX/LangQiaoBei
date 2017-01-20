package algo;

import java.util.Scanner;

public class Algo_097 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = new int[3];
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<arr.length-1; i++){
			for (int j=i+1; j<arr.length; j++){
				if (arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}
}
