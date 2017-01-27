package adv;

import java.util.Scanner;

public class Adv_224 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [][] sudokus = new int[3][3];
		for (int i = 0; i < sudokus.length; i++) {
			for (int j = 0; j < sudokus[i].length; j++) {
				sudokus[i][j] = scanner.nextInt();
			}
		}
		
		if( (sudokus[0][0]+sudokus[0][1]+sudokus[0][2] == 15) 
				&& ( sudokus[1][0]+sudokus[1][1]+sudokus[1][2] == 15 ) 
				&& ( sudokus[2][0]+sudokus[2][1]+sudokus[2][2] == 15 
				&& ( sudokus[0][0]+sudokus[1][0]+sudokus[2][0] == 15 
				&& ( sudokus[0][1]+sudokus[1][1]+sudokus[2][1] == 15 
				&& ( sudokus[0][2]+sudokus[1][2]+sudokus[2][2] == 15 
				&& ( sudokus[0][0]+sudokus[1][1]+sudokus[2][2] == 15 
				&& ( sudokus[0][2]+sudokus[1][1]+sudokus[2][0] == 15 ) ) ) ) ) ) ){
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
