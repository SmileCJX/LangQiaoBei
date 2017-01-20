package algo;

import java.util.Scanner;

public class Algo_083 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i;
		int[] result = { 1 };
		for (i = 1; i < n; i++) {
			result = method(result, i + 1);
		}
		for (i = result.length - 1; i >= 0; i--) {
			if (result[i]==0)
				continue;
			else
				break;
		}
		for (i=0;i<result.length;i++){
			if ((result[i]!=0)){
				System.out.print(result[i]);
				break;
			}
		}
	}

	public static int[] method(int[] k, int s) {
		int i, temp = 0;
		int[] array = new int[k.length + (k[k.length - 1] * s + "").length()
				+1];
		for (i = 0; i < k.length; i++) {
			array[i] = (k[i] * s + temp) % 10;
			if (k[i] * s + temp >= 10)
				temp = (k[i] * s + temp) / 10;
			else
				temp = 0;
		}
		if (temp != 0) {
			for (int j = 0; j < array.length - k.length; j++) {
				array[i + j] = temp % 10;
				if (temp >= 10)
					temp = temp / 10;
				else
					temp = 0;
			}
		}
		return array;
	}
}