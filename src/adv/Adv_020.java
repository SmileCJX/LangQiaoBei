package adv;

import java.util.Scanner;

public class Adv_020 {
	public static Scanner input = new Scanner(System.in);
	public static int n = input.nextInt();
	public static int m = input.nextInt();
	public static int [] arr = new int[n];
	public static void main(String[] args) {
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<m; i++){
			swap(input.nextInt(),input.nextInt());
		}
		
		print();
	}
	
	public static void swap(int x,int y){
		int temp = arr[x-1];
		arr[x-1] = arr[y-1];
		arr[y-1] = temp;
	}
	
	public static void print(){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
