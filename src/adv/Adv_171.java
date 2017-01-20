package adv;

import java.util.Scanner;

public class Adv_171 {
	public static void main(String[] args) {
		String [] arr = new String[]{"1","0","x","9","8","7","6","5","4","3","2"};
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		sb.insert(6, "19");
		int [] num = new int[sb.length()];
		for (int i = 0; i < sb.length(); i++) {
			num[i] = Integer.parseInt(sb.charAt(i)+"");
		}
		int code = (num[0]*7+num[1]*9+num[2]*10+num[3]*5+num[4]*8+num[5]*4+num[6]*2+num[7]*1
				+num[8]*6+num[9]*3+num[10]*7+num[11]*9+num[12]*10+num[13]*5+num[14]*8+num[15]*4+num[16]*2)%11;
		System.out.println(sb.append(arr[code]));
	}
}
