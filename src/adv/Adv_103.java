package adv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adv_103 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int num ;
		while((num=input.nextInt())!=0){
			list.add(num);
		}
		
		for (int i=list.size()-1; i>=0; i--){
			System.out.print(list.get(i)+" ");
		}
	}
}
