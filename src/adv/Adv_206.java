package adv;

import java.math.BigInteger;
import java.util.Scanner;

public class Adv_206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger result = new BigInteger(1+"");
		for(int i=0; i<Integer.valueOf(n.toString()); i++){
			result = result.multiply(new BigInteger(2+""));
		}
		if(result.toString().length()<10){
			System.out.println(result.toString());
		}else{
			System.out.println(result.toString().substring(0,10));
		}
	}
}
