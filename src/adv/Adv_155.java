package adv;

import java.util.Scanner;

public class Adv_155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int [] arr = new int[n];
		int [] result = new int[q];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<q; i++){
			result[i] = method(arr,sc.nextInt(),sc.nextInt());
		}
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}

	private static int method(int[] arr, int lo, int hi) {
		int min = Integer.MAX_VALUE;
		for( ;lo<=hi;lo++){
			if(arr[lo]<min){
				min = arr[lo];
			}
		}
		return min;
	}

}
