package adv;

import java.util.Scanner;

public class Adv_166_NoAC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count1 = 0;
		int count2 = 1;
		for(int i=1; i<arr.length; i++){
			if(arr[i]>arr[i-1]){
				count1++;
			}
		}
		for (int i = arr.length-1; i > 0; i--) {
			if(arr[i]<arr[i-1]){
				count2++;
			}
		}
		if(count1>count2){
			System.out.println(count1);
		}else{
			System.out.println(count2);
		}
	}
}
