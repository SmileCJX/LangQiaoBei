package adv;

import java.util.Scanner;

public class Adv_176 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++){
			if(sc.nextInt()<=(m+30)){
				count++;
			}
		}
		System.out.println(count);
	}
}
