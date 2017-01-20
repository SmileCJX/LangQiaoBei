package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2015_03_05__basic28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++){
			list.add(input.nextInt());
		}
		
		int minCost = 0;
		while(list.size()!=1){
			minCost += getCost(list);
		}
		
		System.out.println(minCost);
	}
	
	public static int getCost(List<Integer> list){
		int min1 = getMin(list);
		int min2 = getMin(list);
		
		int result = min1+min2;
		list.add(result);
		return result;
	}
	
	public static int getMin(List<Integer> list){
		int minNumber = list.get(0);
		
		for (int i=0; i<list.size(); i++){
			if (minNumber>list.get(i)){
				minNumber = list.get(i);
			}
		}
		
		list.remove((Object)minNumber);
		
		return minNumber;
	}
}
