package test;

public class Test1A {
	public static void main(String[] args) {
		f2(9,18);
	}
	
	//´òÓ¡´Ó0-n
	public static void f1(int n){
		if(n>0){
			f1(n-1);
		}
		System.out.println(n);
	}
	
	//´òÓ¡begin-end
	public static void f2(int begin,int end){
		if (begin>end) return;
		System.out.println(begin);
		f2(begin+1,end);
	}
}
