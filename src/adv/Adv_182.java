package adv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Adv_182 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		for (int i = al.size()-1; i > al.size()-11; i--) {
			System.out.print(al.get(i)+" ");
		}
	}
}
