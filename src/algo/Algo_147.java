package algo;

import java.util.Scanner;

public class Algo_147 {
	public static void main(String[] args) {
		for(int flowerNumber = 100; flowerNumber<=999; flowerNumber++){
			if(isNarcissus(flowerNumber)){
				System.out.println(flowerNumber);
			}
		}
	}

	private static boolean isNarcissus(int flowerNumber) {
		int bai = flowerNumber / 100;
		int shi = flowerNumber / 10 % 10;
		int ge = flowerNumber % 10;
		
		int result = cube(bai)+cube(shi)+cube(ge);
		if(flowerNumber == result){
			return true;
		}
		return false;
	}

	private static int cube(int num) {
		
		return num*num*num;
	}
}
