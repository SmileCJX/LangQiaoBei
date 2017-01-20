package adv;

import java.util.Scanner;

public class Adv_073 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] arr = new int[3][4];
		
		int max = Integer.MIN_VALUE;
		int hangIndex=0,lieIndex=0;
		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr[i].length; j++){
				arr[i][j] = Math.abs(input.nextInt());
				if (max<arr[i][j]){
					max = arr[i][j];
					hangIndex = i;
					lieIndex = j;
				}
			}
		}
		System.out.println(max+" "+(hangIndex+1)+" "+(lieIndex+1));
	}
}
