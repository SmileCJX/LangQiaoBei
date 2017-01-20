package test;

import java.math.BigInteger;
//��������һ��Nλ��ʮ�������������������ÿ��λ�ϵ����ֵ�N�η��ĺ͵�����������������Ϊ��������
public class Test6B {
	private static BigInteger [] base = new BigInteger[10]; //ÿ�����ֵ�21�η�
	
	private static BigInteger calcu_21(int n){
		BigInteger a = BigInteger.ONE;
		for(int i=0; i<21; i++){
			a = a.multiply(BigInteger.valueOf(n));
		}
		return a; 
	}
	
	private static void test(int[] a){
		BigInteger bn = BigInteger.ZERO;
		
		for(int i=0; i<a.length; i++){
			bn = bn.add(base[i].multiply(BigInteger.valueOf(a[i])));
		}
		
		String s = bn.toString();
		if(s.length()!=21) return;
		
		int [] b = new int[10];
		for(int i=0; i<s.length(); i++){
			b[s.charAt(i)-'0']++;
		}
		
		for(int i=0; i<10; i++){
			if(a[i] != b[i]) return;
		}
		System.out.println(bn);
	}
	//�����k��������sum������
	private static void f(int [] a,int k,int sum){
		if(sum==0){
			test(a);
			return;
		}
		
		if(k==a.length-1){
			a[k] = sum;
			f(a,k+1,0);
			return;
		}
		
		for(int i=0; i<=sum; i++){
			a[k] = i;
			f(a,k+1,sum-i);
			a[k] = 0;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<base.length; i++){
			base[i] = calcu_21(i);
		}
		int [] a = new int[10]; //ÿ������ȡ����
		f(a,0,21);
	}
	
}
