package prev;

import java.util.Scanner;
import java.util.Stack;

public class Prev_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		stack(m,n);
	}
	
	public static void stack(int m,int n){
		Stack<Integer> ss = new Stack<Integer>();
//		Stack<Integer> copy = new Stack<Integer>();
		for (int i=m; i<=n; i++){
			ss.push(i);
//			copy.push(i);
		}
		int index=2;
		while(index<=ss.size()){
			for (int i=index; i<ss.size(); i++){
				if (i % index == 0){
					ss.remove(i);
				}
			}
			index++;
		}
		System.out.println(index-3);
	}
}
