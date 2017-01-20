package adv;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Adv_066 {
	public static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str = n+"";
		char buf[] = str.toCharArray();

		perm(buf, 0, buf.length - 1);
		
	/*	Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
	}

	public static void perm(char[] buf, int start, int end) {
		if (start == end) {// 当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可（特殊情况）
			String str = "";
			for (int i = 0; i <= end; i++) {
				str = str+buf[i];
				if (!set.contains(Integer.parseInt(str))){
					System.out.println(str);
				}
				set.add(Integer.parseInt(str));
			}
			System.out.println();
		} else {// 多个字母全排列（普遍情况）
			for (int i = start; i <= end; i++) {// （让指针start分别指向每一个数）
				char temp = buf[start];// 交换数组第一个元素与后续的元素
				buf[start] = buf[i];
				buf[i] = temp;

				perm(buf, start + 1, end);// 后续元素递归全排列

				temp = buf[start];// 将交换后的数组还原
				buf[start] = buf[i];
				buf[i] = temp;
			}
		}
	}
}