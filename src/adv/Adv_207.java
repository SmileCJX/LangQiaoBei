package adv;

import java.util.Scanner;

public class Adv_207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int [][] martix = new int[str1.length()+1][str2.length()+1];
		for(int i=1; i<=str1.length(); i++){
			for(int j=1; j<=str2.length(); j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					martix[i][j] = martix[i-1][j-1]+1;
				}else{
					if(martix[i-1][j] >= martix[i][j-1]){
						martix[i][j] = martix[i-1][j];
					}else{
						martix[i][j] = martix[i][j-1];
					}
				}
			}
		}
		System.out.println(martix[str1.length()][str2.length()]);
	}
}
