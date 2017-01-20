package basic;

import java.util.Scanner;

public class Main2014_12_12__basic_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] a = new int[n];
		for (int i=0; i<n; i++){
			a[i] = input.nextInt();
		}
		int sum = 0;
		int max = -10001;
		int min =  10001;
		for (int i=0; i<a.length; i++){
			sum = sum+a[i];
			if (max<a[i])
				max = a[i];
			if (min>a[i])
				min = a[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}
}
