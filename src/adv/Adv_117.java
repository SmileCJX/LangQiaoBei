package adv;

import java.util.Scanner;

public class Adv_117 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(Integer.toHexString(Integer.valueOf(str,16)).toUpperCase()+" "+Integer.valueOf(str,16)+" "+
				Integer.toOctalString(Integer.valueOf(str,16)));
	}
}
