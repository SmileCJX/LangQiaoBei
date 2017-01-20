package adv;

import java.util.Scanner;

public class Adv_157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		boolean flag = false;
		boolean ok = false;
		int len;
		for(len=1; len<=length; len++){
			if(length%len!=0){
				continue;
			}
			for(int i=0; i<len; i++){
				flag = true;
				for(int j=1; j*len<length; j++){
					if(str.charAt(i)!=str.charAt(j*len+i)){
						flag = false;
						break;
					}
				}
			}
			if(flag){
				ok = true;
				break;
			}
		}
		if(ok){
			System.out.println(length/len);
		}else{
			System.out.println(1);
		}
	}
}
