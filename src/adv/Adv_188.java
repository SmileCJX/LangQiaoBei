package adv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Adv_188{
	public static Scanner sc = new Scanner(System.in);
	public static int n = sc.nextInt();
	public static int count = 0;
	public static void main(String[] args) {
		permute(Arrays.asList(0,1,2,3,4,5,6,7,8,9),0);
	}

	private static void permute(List<Integer> arr, int k) {
		for(int i=k; i<arr.size(); i++){
			Collections.swap(arr, i, k);
			permute(arr,k+1);
			Collections.swap(arr, k, i);
		}
		if(k == arr.size()-1){
			count++;
			if(count == n){
				for (int i = 0; i < arr.size(); i++) {
					System.out.print(arr.get(i));
				}
			}
		}
		
	}
}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class Adv_188 {
//	public static Scanner sc = new Scanner(System.in);
//	public static int index = sc.nextInt();
//	public static int count = 0;
//	public static void main(String[] args) {
//		
//		String [] datass = new String[]{"0","1","2","3","4","5","6","7","8","9"};
//		sort(Arrays.asList(datass),new ArrayList());
//	}
//	private static void sort(List<String> datas,List target) {
//		if(target.size() == 10){
//			count++;
//			for(Object obj : target){
//				if(count == index){
//					System.out.print(obj);
//				}	
//			}
//			return;
//		}
//		for(int i=0; i<datas.size(); i++){
//			List newdatas = new ArrayList(datas);
//			List newTarget = new ArrayList(target);
//			newTarget.add(newdatas.get(i));
//			newdatas.remove(i);
//			sort(newdatas,newTarget);
//		}
//	}
//
//}
