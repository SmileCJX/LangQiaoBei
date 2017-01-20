package adv;

import java.util.Scanner;

public class Adv_183 {
	public static Scanner sc = new Scanner(System.in);
	public static int n = sc.nextInt();
	public static int m = sc.nextInt();
	public static int [] children = new int[n+1];
	public static void main(String[] args) {
		int li,ri,ci;
		for(int i=0; i<m; i++){
			li = sc.nextInt();
			ri = sc.nextInt();
			ci = sc.nextInt();
			for( ; li<=ri; li++){
				children[li] += ci;
			}
		}
		for (int i = 1; i < children.length; i++) {
			System.out.print(children[i]+" ");
		}
	}

}
