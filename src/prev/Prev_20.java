package prev;

import java.math.BigInteger;
import java.util.Scanner;

public class Prev_20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger k = sc.nextBigInteger();
		BigInteger p = new BigInteger(0+"");
		
		BigInteger  h = zh(m,n);
		BigInteger tp = BigInteger.ONE;
		for(int i=0; i<=n.intValue(); i++){
			tp = zh(new BigInteger(i+""),n).multiply(ik(new BigInteger(i+""),k));
			p = p.add(tp);
		}
		
		System.out.println((p.multiply(h)).mod(new BigInteger(999101+"")));
	}

	private static BigInteger ik(BigInteger x, BigInteger y) {
		BigInteger q = BigInteger.ONE;
		for(int p=0; p<y.intValue(); p++){
			q = q.multiply(x);
		}
		return q;
	}

	private static BigInteger zh(BigInteger a, BigInteger b) {
		BigInteger temp = jc(a).multiply(jc(b.subtract(a)));
		return jc(b).divide(temp);
	}

	private static BigInteger jc(BigInteger j) {
		BigInteger sum = BigInteger.ONE;
		for(int i=1; i<=j.intValue(); i++){
			sum = sum.multiply(new BigInteger(i+""));
		}
		return sum;
	}
}
//import java.util.*;
//import java.io.*;
//import java.math.*;
//public class prev_20
//{
//    static int k;
//    static long rn,p=999101;
//    static long dp[][]=new long[1005][1005];
//    static long f[]=new long[1000005];
//    static BigInteger n,m;
//    static public void main(String args[])
//    {
//        Scanner cin=new Scanner(System.in);
//        n=cin.nextBigInteger();
//        m=cin.nextBigInteger();
//        k=cin.nextInt();
//        rn=n.mod(BigInteger.valueOf(p)).longValue();
//        build();
//        long ans=0;
//        long n_k=pow_big(2,n);
//        for(int i=0;i<=k;i++)
//        {
//            ans=(ans+dp[k][i]*n_k)%p;
//            n_k=(((p+1)/2)*n_k)%p;
//        }
//        ans=(ans*Lucas(n,m))%p;
//        System.out.println(ans);
//    }
//    static public void build()
//    {
//        f[0]=1;
//        for(int i=1;i<p;i++)
//        {
//            f[i]=(i*f[i-1])%p;
//        }
//        dp[0][0]=1;
//        for(int i=0;i<k;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                dp[i+1][j]=(dp[i+1][j]+j*dp[i][j])%p;
//                dp[i+1][j+1]=(dp[i+1][j+1]+(rn-j+p)*dp[i][j])%p;
//            }
//        }
//    }
//    static public long pow_big(long a,BigInteger k)
//    {
//        long res=1,t=a;
//        while(k.compareTo(BigInteger.valueOf(0))==1)
//        {
//            if(k.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ONE)==0)
//            {
//                res=(res*t)%p;
//            }
//            t=(t*t)%p;
//            k=k.divide(BigInteger.valueOf(2));
//        }
//        return res;
//    }
//    static public long C(int n,int m)
//    {
//        if(m>n)return 0;
//        long res=1;
//        res=(res*f[n])%p;
//        res=(res*pow_big(f[m],BigInteger.valueOf(p-2)))%p;
//        res=(res*pow_big(f[n-m],BigInteger.valueOf(p-2)))%p;
//        return res;
//    }
//    static public long Lucas(BigInteger n,BigInteger m)
//    {
//        if(m.compareTo(BigInteger.ZERO)==0)return 1;
//        return C(n.mod(BigInteger.valueOf(p)).intValue(),
//                 m.mod(BigInteger.valueOf(p)).intValue())
//                *Lucas(n.divide(BigInteger.valueOf(p)),
//                       m.divide(BigInteger.valueOf(p)))%p;
//    }
//}
