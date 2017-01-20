package algo;

import java.util.Scanner;

public class Algo_145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int a = 0;
	    int b = 0;
	    for (int i = 1; i <= n; i++) {
	        if (a != (n - i)) {
	            System.out.print(" ");
	            a++;
	            i = i - 1;
	        } else if (b != (2 * i - 1)) {
	            System.out.print("*");
	            b++;
	            i = i - 1;
	        } else if (a == (n - i) && b == (2 * i - 1)) {
	            System.out.println();
	            a = 0;
	            b = 0;
	        }
	    }		
	}
}
