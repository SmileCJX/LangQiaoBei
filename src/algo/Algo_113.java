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
		
		//遍历数组
		for(int i=0; i<number.length; i++){
			//从数组中单个取出每个数字，当做键，从集合里面去获取值
			Integer integer = treeMap.get(number[i]);
			//值integer有两个可能，一种是null,一种是非null
			if(integer == null){ //集合中没有
				treeMap.put(number[i], 1);
			}else if(integer != null){ //在集合中出现过了
				integer++;
				treeMap.put(number[i], integer);
			}
		}
		
		//对map集合进行迭代的操作
		Set<Integer> set = treeMap.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			Integer num = it.next();
			Integer i = treeMap.get(num);
			System.out.println(num+" "+i);
		}
	}
}
