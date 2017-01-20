package adv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Adv_108 {
	public static int []count = new int[5];
	public static void main(String[] args) {
		try {
			BufferedReader bfr = new  BufferedReader(new InputStreamReader(System.in));
			String s = bfr.readLine();
			String [] arr = s.split(" ");
			List<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<arr.length; i++){
				list.add(Integer.parseInt(arr[i]));
			}
			for (Integer integer : list) {
				switch (integer/10) {
				case 10:
					count[0]++;
					break;
				case 9:
					count[0]++;
					break;
				case 8:
					count[1]++;
					break;
				case 7:
					count[2]++;
					break;
				case 6:
					count[3]++;
					break;
				default:
					count[4]++;
					break;
				}
			}
			for(int i=0; i<count.length; i++){
				System.out.print(count[i]+" ");
			}
			System.out.println();
			int max = Integer.MIN_VALUE;
			int index = 0;
			for(int i=0; i<count.length; i++){
				if(max < count[i]){
					max = count[i];
					index = i;
				}
			}
			System.out.println(max);
			Collections.sort(list);
			int sum = 0;
			for(int i=0; i<index; i++){
				sum += count[i];
			}
			for(int i=list.size()-sum-1; i>list.size()-sum-max-1; i--){
				System.out.print(list.get(i)+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}


}
