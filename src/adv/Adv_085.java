package adv;

import java.util.Scanner;

public class Adv_085 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.println(n+"+"+m+"="+(n+m));
		System.out.println(n+"-"+m+"="+(n-m));
		System.out.println(n+"*"+m+"="+(n*m));
		System.out.println(n+"/"+m+"="+(n/m));
	}
}
