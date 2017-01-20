package algo;

import java.util.Scanner;

public class Algo_001 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int [] arr =  new int[n];
		
		for (int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		int m = input.nextInt();
		
		int [] result = new int[m];
		int sum=0;
		while(m!=0){
			int l = input.nextInt();
			int r = input.nextInt();
			int k = input.nextInt();
			result[sum++] = method1(arr,l,r,k);
			m--;
		}
		
		for (int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}

	public static int method1(int [] arr,int l,int r,int k){
		int [] array = new int[r-l+1];
		l--;
		r--;
		for (int i=0; i<array.length; i++){
			array[i] = arr[l];
			l++;
		}
		for(int i=0; i<array.length-1; i++)
			for (int j=i+1; j<array.length; j++){
				if (array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
	
		return array[k-1];
	}
}
