package test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Test4B {
	public static void main(String[] args) {
		//��������
		//3.16 ----> 3.2
		//3.149 ----->3.1
		//3.150 ----->3.2 ????
		//�����������˫
		
		//��Ч����100λ�����⾫��С��
		BigDecimal a = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(6),new MathContext(100));
		System.out.println(a);
		
		//IEEE754 5������ֵ
//		double a = 3.0/0;
//		System.out.println(a+1);
//		System.out.println(a+a);
//		System.out.println(1/a);
//		System.out.println(a*-1);
//		System.out.println(1/(-a));
//		System.out.println(a-a);
//		System.out.println(a/a);
//		
//		double b = 0.0/0.0;
//		System.out.println(b); // NaN: Not a Number
//		System.out.println(b+12);
	}
}
