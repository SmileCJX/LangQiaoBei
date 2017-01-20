package algo;

import java.util.Scanner;

public class Algo_126 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		int	bai = i/100;
		int	shi = i/10%10;
		int	ge = i % 10;

		if(i == bai*bai*bai+shi*shi*shi+ge*ge*ge){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
