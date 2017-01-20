package prev;

import java.util.Scanner;

public class prev_08 {
	public static int N = 1000*100;
	static int se(int [] da,int a){
		int n = 0;
		for (int i=0; i<da.length; i++){
			if (da[i] == 1){
				n++;
				if (n>=a){
					return i-a;
				}
			}else{
				n = 0;
			}
		}
		return -1;
	}
	
	public static void f(int a,int b){
		int [] da = new int[N];
		for (int i=0; i<=N/a; i++){
			for (int j=0; j<=(N-i*a)/b; j++){
				if (i*a+b*j < N){
					da[i*a+b*j] = 1;
				}
			}
		}
		System.out.println(se(da,Math.min(a, b)));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		f(m,n);
	}
}
