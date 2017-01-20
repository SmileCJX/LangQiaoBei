package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adv_102 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		String str = bfr.readLine();
		String [] arr = new String[2];
		int count = 0;
	/*	arr = str.split(" ");
		str = str.substring(arr[0].length()+1);
		System.out.println(str);*/
		while(str!=null){
			if(!str.contains(" ")){
				count++;
				break;
			}
			arr = str.split(" ");
			/*for (int i=0; i<arr.length; i++){
				System.out.println(arr[i]);
			}*/
			str = str.substring(arr[0].length()+1);
			count++;
		}
		System.out.println(count);
	}
}	
