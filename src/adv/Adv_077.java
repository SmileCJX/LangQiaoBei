package adv;

import java.util.Scanner;

public class Adv_077 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] sum = new double[4];
		int[][] arr = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			sum[i] = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];
			System.out.printf("%.2f", sum[i] / 4);
			System.out.println();
		}
	}

}
