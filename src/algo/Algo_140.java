package algo;

import java.util.Scanner;

public class Algo_140 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int goodItems = Integer.valueOf(scanner.nextLine());
		double totalPrice = 0.0;
		for (int index = 0; index < goodItems; index++) {
			String goodNameAndPriceAndAmount = scanner.nextLine();
			String[] splitGoodNameAndPriceAndAmount = goodNameAndPriceAndAmount.split(" ");
			double price = Double.valueOf(splitGoodNameAndPriceAndAmount[1]);
			double amount = Double.valueOf(splitGoodNameAndPriceAndAmount[2]);
			totalPrice += (price*amount);
		}
		
		System.out.printf("%.6f",totalPrice);
	}
}
