package prev;

import java.util.Scanner;

public class Prev_027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ant = new int[n];
		for (int i = 0; i < ant.length; i++) {
			ant[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = 0;
		for(int i=1; i<n; i++){
			// 右边向左走的
			if(ant[i]<0 && Math.abs(ant[i])>Math.abs(ant[0])){
				left++;
			}
			//左边向右走的
			if(ant[i]>0 && Math.abs(ant[i])<Math.abs(ant[0])){
				right++;
			}
		}
		
		if((ant[0]<0 && right==0)||(ant[0]>0 && left==0)){
			System.out.println(1);
		}else{
			System.out.println(left+right+1);
		}
	}
}
