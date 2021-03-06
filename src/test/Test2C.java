package test;

//求两个串的最大公共子序列的长度
//算法：可解，优化
public class Test2C {
	public static int f(String s1,String s2){
		if (s1.length()==0||s2.length()==0) return 0;
		if (s1.charAt(0)==s2.charAt(0))
			return f(s1.substring(1),s2.substring(1))+1;
		else
			return Math.max(f(s1.substring(1), s2),f(s1,s2.substring(1)));
	}
	
	public static void main(String[] args){
		int k = f("fabckd","xbacd");
		System.out.println(k);
	}
}
