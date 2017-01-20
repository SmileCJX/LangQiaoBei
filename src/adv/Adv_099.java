package adv;

import java.util.Scanner;

public class Adv_099 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		if (n==0 || m==0){
			return;
		}
		for (int i=0; i<n*2+1; i++){
			for (int j=0; j<m*2+1; j++){
				if (i % 2 ==0){
					if (j % 2 == 0){
						System.out.print("+");
					}else{
						System.out.print("-");
					}
				}else{
					if (j % 2 == 0){
						System.out.print("|");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
