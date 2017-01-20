package prev;

import java.util.Scanner;

public class Main2015_03_20__prev29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int p = input.nextInt();
		int [] sum = new int[1000];
		int i=2;
		sum[0] = 1;
		sum[1] = 1;
		int flag = n>m ? n:m;
		while(i<flag){
			if (i>=m){
				sum[i] = sum[i]%sum[m-1];
			}
			sum[i] = sum[i]-sum[i]/sum[m-1]*sum[i];
			i++;
		}
		int result = 0;
		for (int index=0; index<n; index++){
			result = (result+sum[index])%sum[m-1];
		}
		System.out.println(result%sum[m-1]%p);
	}
}
/*	Scanner input = new Scanner(System.in);
int n = input.nextInt();
int m = input.nextInt();
int p = input.nextInt();
int sum = 0;
for (int i=1; i<=n; i++){
	sum = (sum+method(i))%p;
}
//System.out.println(sum);
int result = method(m);
System.out.println(sum % result % p);
//System.out.println(result);
}

public static int method(int n){
if (n==1 || n==2){
	return 1;
}else{
	return method(n-1)+method(n-2);
}*/