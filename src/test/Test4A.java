package test;

public class Test4A {
	public static void main(String[] args) {
//		不安全的一种做法
//		System.out.println(0.2+0.1); 
		method2();
	}
	public static void method1(){
		for (int a=0; a<100; a++){
			for (int b=0; b<100; b++){
				if (a*23+b*19==823){
					System.out.println(a+","+b);
				}
			}
		}
	}
	public static void method2(){
		//海盗比酒
		for (int a=20; a>=1; a--)
			for (int b=a-1; b>=1; b--)
				for(int c=b-1; c>=1; c--)
					for(int d=c-1; d>=1; d--){
//						if (1.0/a+1.0/b+1.0/c+1.0/d==1.0){
						if(b*c*d+a*c*d+a*b*d+a*b*c == a*b*c*d){
							System.out.println(a+","+b+","+c+","+d);
						}
					}
	}
}
