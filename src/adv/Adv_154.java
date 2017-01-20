package adv;

import java.util.Scanner;

public class Adv_154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] num = new int[t];
		
		//找出其中最大的那个数
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(max<num[i]){
				max = num[i];
			}
		}
		
		//筛选素数
		boolean [] primes = new boolean[max+1];
		primes[0] = true;
		primes[1] = true;
		for (int i = 2; i < primes.length; i++) {
			if(!primes[i]){
				for (int j = i*2; j < primes.length; j=j+i) {
					primes[j] = true;
				}
			}
		}
		
		boolean flag = false;
		for(int i=0; i<num.length; i++){
			flag = false;
			for(int j=2; j<num[i]; j++){
				if(!primes[j] && num[i]%j==0 && !primes[num[i]/j]){
					System.out.println("Yes");
					j=num[i]-1;
					flag = true;
				}
			}
			if(flag == false){
				System.out.println("No");
			}		
		}
	}
}
