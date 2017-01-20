package test;

import java.math.BigInteger;

public class Test5A {
	public static void main(String[] args) {
//		整数，整除，余数
//		最大公约数，最小公倍数  a*b/gcd(a,b)
		
//		int a = 15;
//		int b = 40;
//		
//		for(int i=a; i>=1; i--){
//			if(a%i==0 && b%i==0){
//				System.out.println(i);
//				break;
//			}
//		}
		
		//【a,b] --- [b%a,a] [15,40] --- [10,15] --- [5,10] --- [0,5]
//		for(;;){
//			if(a==0){
//				System.out.println(b);
//				break;
//			}
//			int t = a;
//			a = b%a;
//			b = t;
//		}
		
//		System.out.println(f(2,5,17));
		
//		System.out.println(gcd(15,40));
//		prime();
		System.out.println(calcu(15));
	}
	
	// a = ka*p + a1
	// b = kb*p + b1
	// a % p b%p (a+b)%p = (a%p+b%p)%p (a*b)%p = (a%p)*(b%p)%p
	// a的n次幂对p取模
	public static int f(int a,int n,int p){
		int x = 1;
		for(int i=0; i<n; i++){
			x = (x*a) % p;
		}
		return x%p;
	}
	
	public static int gcd(int a,int b){
		if (a==0) return b;
		return gcd(b%a,a);
	}
	
	
	public static  BigInteger calcu(int n){
		BigInteger a = BigInteger.ONE;
		for (int i=0; i<21; i++) a = a.multiply(BigInteger.valueOf(n));
		return a;
	}
}
