package algo;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Algo_113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] number = new int[n];
		for(int i=0; i<number.length; i++){
			number[i] = sc.nextInt();
		}
		
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		//��������
		for(int i=0; i<number.length; i++){
			//�������е���ȡ��ÿ�����֣����������Ӽ�������ȥ��ȡֵ
			Integer integer = treeMap.get(number[i]);
			//ֵinteger���������ܣ�һ����null,һ���Ƿ�null
			if(integer == null){ //������û��
				treeMap.put(number[i], 1);
			}else if(integer != null){ //�ڼ����г��ֹ���
				integer++;
				treeMap.put(number[i], integer);
			}
		}
		
		//��map���Ͻ��е����Ĳ���
		Set<Integer> set = treeMap.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			Integer num = it.next();
			Integer i = treeMap.get(num);
			System.out.println(num+" "+i);
		}
	}
}
