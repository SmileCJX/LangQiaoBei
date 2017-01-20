package prev;

import java.util.Scanner;

public class Main2015_03_31__prev23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int t = input.nextInt();
		long [] a = new long[n*t];
		a[1] = 1;
		int sum = 0;
		for (int i=2; i<n*t; i++){
			a[i] = a[i-1];
			a[i] = a[i]+i-1;
			
			if (a[i]>=k){
				a[i] = a[i]%k;
			}
			if (i%n == 1){
				sum += a[i];
			}
		}
		System.out.println(sum+1);
	}
}
