package algo;

import java.util.Scanner;

public class Algo_116 {
	public static Scanner sc = new Scanner(System.in);
	public static int n = sc.nextInt();
	public static int k = sc.nextInt();
	public static int [] nums = new int[n];
	

	public static void main(String[] args) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		long max = test(nums,0,n,k);
		System.out.println(max);
	}

	private static long test(int[] nums, int start, int n, int k) {
		if(k == 0){
			return getsum(nums,start,start+n-1);
		}
		long [] midd = new long[16];
		int loc = start;
		long max = Long.MIN_VALUE;
		for(;loc-start<n-1;loc++){
			midd[loc] = getsum(nums,start,loc)*test(nums,loc+1,start+n-loc-1,k-1);
			max = max<midd[loc] ? midd[loc]:max;
		}
		return max;
	}

	private static int getsum(int[] nums, int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++){
			sum +=nums[i];
		}
		return sum;
	}
}
