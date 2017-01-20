package test;

//在n个球中，任意取出m个（不放回）,求有多少种不同取法
public class Test2A {
	public static void main(String[] args) {
		int k = f(5,3);
		System.out.println(k);
	}
	
	//n个取m个
	public static int f(int n,int m){
		if(n<m){
			return 0;
		}
		if (n==m) return 1;
		if (m==0) return 1;
		
		return f(n-1,m-1)+f(n-1,m); //n个里有个特殊球x，取法划分：包不包含x
	}
}
