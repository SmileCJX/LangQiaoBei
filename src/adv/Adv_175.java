package adv;

import java.util.Scanner;

public class Adv_175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		int [] ary = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		int temp;
		for (int i = 0; i < ary.length-1; i++) {
			for(int j=i+1; j<ary.length; j++){
				if(ary[i] < ary[j]){
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
	}

}
