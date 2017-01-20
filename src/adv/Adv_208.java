package adv;

import java.math.BigInteger;
import java.util.Scanner;

public class Adv_208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ai = sc.nextInt();
		int aj = sc.nextInt();
		int [][] a = new int[ai][aj];
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int bi = sc.nextInt();
		int bj = sc.nextInt();
		int [][] b = new int[bi][bj];
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				b[i][j] = sc.nextInt();
			}
		}
		
		BigInteger [][] result = new BigInteger[a.length][b[0].length];
		
		BigInteger temp = BigInteger.ZERO;

		for(int i=0; i<a.length; i++){
			for(int j=0; j<b[i].length; j++){
				temp = BigInteger.ZERO;
				for(int x=0; x<b.length; x++){
					temp = new BigInteger(a[i][x]*b[x][j]+"").add(temp);
				}
				result[i][j] = temp;
			}
		}
		
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
