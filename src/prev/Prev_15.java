package prev;

import java.math.BigInteger;
import java.util.Scanner;

public class Prev_15 {
	public static BigInteger [] a = new BigInteger[1001];
	public static BigInteger [] b = new BigInteger[1001];
	public static BigInteger [] temp = new BigInteger[1001];
	public static BigInteger temp1 ;
	public static BigInteger temp2 ;
	public static BigInteger sum;
	public static final BigInteger NUM = new BigInteger(1000000007+"");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		b[1] = new BigInteger(1+"");
		for(int i=2; i<=n; i++){
			b[i] = (b[i-1].multiply(new BigInteger(2+"")).mod(NUM));
		}
		a[1] = new BigInteger(1+"");
		a[2] = new BigInteger(6+"");
		for(int i=3; i<=n; i++){
			temp[i] = (a[i-1].multiply(new BigInteger(2+"")).add(b[i]));
			a[i] = a[i-2].multiply(new BigInteger(4+"")).add(temp[i]).mod(NUM);
		}
		sum = a[n].multiply(new BigInteger(4+""));
		
		for(int i=2; i<n; i++){
			temp1 = b[n-i].multiply(a[i-1].multiply(new BigInteger(8+""))).mod(NUM);
			temp2 = b[i-1].multiply(a[n-i].multiply(new BigInteger(8+""))).mod(NUM);
			sum = sum.add(temp1).add(temp2).mod(NUM);
		}
		
		if(n==1){
			sum = new BigInteger(2+"");
		}
		System.out.println(sum);
	}

}
