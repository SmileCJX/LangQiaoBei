package algo;

import java.util.Arrays;
import java.util.Scanner;

public class Algo_034 {
	public static void main(String[] args) {
		int w,n;
		Scanner sc = new Scanner(System.in);
		
		w = sc.nextInt();
		n = sc.nextInt();
		int [] money = new int[n];
		for (int i=0; i<n; i++){
			money[i] = sc.nextInt();
		}
		Arrays.sort(money);
		
//		for (int i = 0; i < money.length; i++) {
//			System.out.println(money[i]);
//		}
		
		int i = 0,j = n-1,count = 0;
		while(n>0){
			if(i == j){
				n--;
				count++;
			}else if((money[i]+money[j]) <= w){
				n = n-2;
				i++;
				j--;
				count++;
			}else{
				n--;
				j--;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
