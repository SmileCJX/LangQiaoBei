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
		if (start == end) {// ��ֻҪ���������һ����ĸ����ȫ����ʱ��ֻҪ�Ͱ�������������ɣ����������
			String str = "";
			for (int i = 0; i <= end; i++) {
				str = str+buf[i];
				if (!set.contains(Integer.parseInt(str))){
					System.out.println(str);
				}
				set.add(Integer.parseInt(str));
			}
			System.out.println();
		} else {// �����ĸȫ���У��ձ������
			for (int i = start; i <= end; i++) {// ����ָ��start�ֱ�ָ��ÿһ������
				char temp = buf[start];// ���������һ��Ԫ���������Ԫ��
				buf[start] = buf[i];
				buf[i] = temp;

				perm(buf, start + 1, end);// ����Ԫ�صݹ�ȫ����

				temp = buf[start];// ������������黹ԭ
				buf[start] = buf[i];
				buf[i] = temp;
			}
		}
	}
}