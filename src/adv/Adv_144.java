package adv;

import java.util.Scanner;

public class Adv_144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] w = new int[201];
		int [] v = new int[201];
		int [] f = new int[5001];
		
		for(int i=1; i<=n; i++){
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		for(int i=1; i<=n; i++){
			for(int j=m; j>=w[i]; j--){
				if(f[j]<(f[j-w[i]]+v[i])){
					f[j] = f[j-w[i]]+v[i];
				}
			}
		
		}
		System.out.println(f[m]);
	}
}	
