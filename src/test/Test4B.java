package test;

import java.math.BigDecimal;
import java.math.MathContext;

public class Test4B {
	public static void main(String[] args) {
		//四舍五入
		//3.16 ----> 3.2
		//3.149 ----->3.1
		//3.150 ----->3.2 ????
		//四舍六入五成双
		
		//有效数字100位：任意精度小数
		BigDecimal a = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(6),new MathContext(100));
		System.out.println(a);
		
		//IEEE754 5个特殊值
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
