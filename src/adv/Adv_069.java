package adv;

import java.util.Scanner;

public class Adv_069{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = 2;
		
		System.out.print(n+"=");
		while(true){
			if (n==1){
				break;
			}
			if (n % num==0){
				if (n/num!=1){
					System.out.print(num+"*");
				}else{
					System.out.print(num);
				}
		
				n = n / num;
				continue;
			}else{
				num++;
			}
		}
	}
}
