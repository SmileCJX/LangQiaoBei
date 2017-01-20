package algo;

import java.util.Scanner;

public class Algo_011{
	private static Scanner input = new Scanner(System.in);
	private static int n = input.nextInt();
	private static int x1 = 1;
	private static int sum = 0;
	private static int [] arr = new int[n];
	public static void main(String[] args) {
		for (int i=1; i<=n; i++){
			arr[i-1] = func(i);
		}
		if (n>1){
			sum = arr[n-1]+arr[n-2];
			System.out.println(sum);
		}else{
			System.out.println(1);
		}
		
	}
	public static int func(int i){
		if (i>2){
			return func(i-1)+func(i-2);
		}else{
			return 1;
		}
	}
}