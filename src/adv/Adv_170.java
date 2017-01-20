package adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Adv_170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int count = 0;
		while(n!=6174){
			for(int i=0;i<4; i++){
				al.add(n%10);
				n = n/10;
			}
			Collections.sort(al);
//			System.out.println(al.get(3)+" "+al.get(2)+" "+al.get(1)+" "+al.get(0));
			n = al.get(3)*1000+al.get(2)*100+al.get(1)*10+al.get(0)-(
					al.get(0)*1000+al.get(1)*100+al.get(2)*10+al.get(3));
			al.clear();
			count++;
		}
		System.out.println(count);
	}
}
