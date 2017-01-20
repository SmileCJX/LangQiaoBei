package prev;

import java.util.Scanner;

public class Main2015_03_28__prev10 {
	public static int[] a= new int[50000+1];
	
	public static void lucky(int start,int [] a,int len){
		int k = start,num = a[start];
		for (int i=k; i<len; i++){
			if (i%num!=0)
				a[k++] = a[i];
		}
		if (num < len){
			lucky(start+1,a,k);
		}
	}
	public static void main(String[] args) {
		int len = 50000,kinds = 0;
		for (int i=1; i<len; i++)
			a[i] = 2*i-1;
		
		lucky(2,a,len);
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		
		for (int i=1; i<len; i++){
			if(a[i]>=n || a[i] == a[i-1]){
				break;
			}
			if (a[i]>m && a[i]<n){
				System.out.println(a[i]);
				kinds++;
			}
		}
		System.out.println(kinds);
	}
}

