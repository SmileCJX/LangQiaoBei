package adv;

import java.util.Scanner;

public class Adv_156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n+1];
		
		for(int i=1; i<num.length; i++){
			num[i] = sc.nextInt();
		}
		
		int result;
		int idea;
		int max = Integer.MIN_VALUE;
		for(int i=num.length-1; i>0; i--){
			idea = i;
			result = 1;
			while(num[idea]!=0){
				idea = num[idea];
				result++;
			}
			if(max<result){
				max = result;
			}
		}
		System.out.println(max);
	}
}
