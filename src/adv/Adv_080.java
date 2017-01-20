package adv;

import java.util.Scanner;

public class Adv_080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]){
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
