package algo;

import java.util.Scanner;

public class Algo_119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] num = new int[n];
		int ans,temp;
		for(int i=1; i<=n; i++){
			ans = i;
			temp = i;
			while(temp > 0){
				ans += temp % 10;
				temp = temp/10;
			}
			if(ans<n){
				num[ans]++;
			}
		}
		
		for(int i=1; i<n; i++){
			if(num[i]==0){
				System.out.println(i);
			}
		}
	}
}
