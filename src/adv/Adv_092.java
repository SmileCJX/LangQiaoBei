package adv;

import java.util.Scanner;

public class Adv_092 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println(gcd(n,m));
	}
	
	public static int gcd(int n,int m){
		int num = n>m ? m:n;
		while(true){
			if (n % num == 0 && m % num ==0){
				break;
			}
			num--;
		}
		return num;
	}

}
