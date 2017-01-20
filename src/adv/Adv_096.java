package adv;

import java.util.Scanner;

public class Adv_096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int solid = 0;
		int vitural = 0;
		for(int i=0; i<n; i++){
			solid += sc.nextInt();
			vitural += sc.nextInt();
		}
		System.out.println(solid+"+"+vitural+"i");
	}
}
