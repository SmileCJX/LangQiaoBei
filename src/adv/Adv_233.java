package adv;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Adv_233 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		List<String> opertionLists = new ArrayList<String>();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			switch (scanner.nextInt()) {
			case 1:
				queue.offer(scanner.nextInt());
				break;
			case 2:
				if(queue.size() != 0){
					opertionLists.add(String.valueOf( queue.poll() ));
				} else {
					opertionLists.add("no");
					
					for (String s:opertionLists) {
						System.out.println(s);
					}
					return;
				}
				break;
			case 3:
				opertionLists.add(String.valueOf( queue.size() ));
				break;
			default:
				break;
			}
		}
		
		for (String s:opertionLists) {
			System.out.println(s);
		}

			
	}
}
