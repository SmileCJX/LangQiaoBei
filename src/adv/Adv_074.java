package adv;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Adv_074 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = 2;
		Set<Integer> set = new TreeSet<Integer>();
		while(true){
			if (n==1){
				break;
			}
			if (n % num==0){
				set.add(num);
				n = n / num;
				continue;
			}else{
				num++;
			}
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
