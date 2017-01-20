package basic;
/*
 * 
 * 问题描述
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：

00000

00001

00010

00011

00100

请按从小到大的顺序输出这32种01串。

输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
00000
00001
00010
00011
<以下部分省略>
 */
public class Main2014_12_12__basic_02 {
	public static void main(String[] args) {
		for(int i1=0; i1<2; i1++)
			for (int i2=0; i2<2; i2++)
				for (int i3=0; i3<2; i3++)
					for (int i4=0; i4<2; i4++)
						for (int i5=0; i5<2; i5++){
							System.out.println(i1+""+i2+""+i3+""+i4+""+i5);
						}
	}
}
