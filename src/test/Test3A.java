package test;

public class Test3A {
	public static void main(String[] args) {
//		System.out.println(f("abcd"));
//		int level = 6;
//		for (int i=0; i<=level; i++){
//			System.out.print(f(level,i)+" ");
//		}
		System.out.println(g(3,2));
	}
	
	//逆序输出字符串
	public static String f(String s){
		if (s.length()<=1) return s;
		return f(s.substring(1))+s.charAt(0);
	}
	/**
	 * 1
	 * 1  1
	 * 1  2  1
	 * 1  3  3  1
	 * 1  4  6  4  1
	 * 1  5 10 10  5  1
	 * @param m
	 * @param n
	 * @return
	 */
	//杨辉三角m层的第n个元素
	public static int f(int m,int n){
		if (n==0) return 1;
		if (m==0) return 1;
		return f(m-1,n)+f(m-1,n-1);
	}
	
	//m个A,n个B,组成多少排列
	public static int g(int m,int n){
		if(m==0 || n==0){
			return 1;
		}
		return g(m-1,n)+g(m,n-1);
	}
}
