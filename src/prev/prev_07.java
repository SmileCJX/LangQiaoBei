package prev;

import java.util.Scanner;

public class prev_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] num = new int[n];
		for (int i=0; i<num.length; i++){
			num[i] = input.nextInt();
		}
		int count=0;
		for (int i=0; i<n; i++){
			int min = n;
			int max = 1;
			for (int j=i; j<n; j++){
				if (min>num[j]){
					min = num[j];
				}
				if (max<num[j]){
					max = num[j];
				}
				if ((max - min)==(j-i)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
