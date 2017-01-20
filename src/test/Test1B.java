package test;

public class Test1B {
	public static int addAll(int [] a){
		int x = 0;
		for (int i=0;i <a.length; i++){
			x += a[i];
		}
		return x;
	}
	//求a数组中，从begin到结束的元素和
	public static int f(int [] a,int begin){
		if (begin == a.length){
			return 0;
		}
		//踢皮球
		int x = f(a,begin+1);  
		return x + a[begin];
	}
	
	public static void main(String[] args) {
		int [] a = {2,5,3,9,12,7};
//		int sum = addAll(a);
		int sum = f(a,0);//从第0项开始的累加值
		System.out.println(sum);
		
	}
}
