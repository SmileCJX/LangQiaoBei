package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Algo_050 {
	public static void main(String[] args) throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String [] arr = str.split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		//System.out.println(n+"---"+m);
		
		str = bfr.readLine();
		arr = str.split(" ");
		int [] num = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			num[i] = Integer.parseInt(arr[i]);
		}
		
		Set<Integer> set = new TreeSet<Integer>();
		for (int i=0; i<num.length; i++){
			if (num[i] % m !=0){
				set.add(num[i]);
			}
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			int i = (int)it.next();
			if (i>=(char)'A' && i<=(char)'Z'){
				System.out.print((char)i+" ");
			}else{
				System.out.print(i+" ");
			}
			/*System.out.println(it.next());*/
		}
	}
}
