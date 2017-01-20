package adv;

import java.util.Scanner;

public class Adv_173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < str.length; i++) {
			switch (str[i]) {
			case "WYS":
				System.out.println("KXZSMR");
				break;
			case "CQ":
				System.out.println("CHAIQIANG");
				break;
			case "LC":
				System.out.println("DRAGONNET");
				break;
			case ("SYT"):
				System.out.println("STUDYFATHER");
				break;
			case ("SSD"):
				System.out.println("STUDYFATHER");
				break;
			case ("LSS"):
				System.out.println("STUDYFATHER");
				break;
			case ("LYF"):
				System.out.println("STUDYFATHER");
				break;
			default:
				System.out.println("DENOMINATOR");
				break;
			}
		}
	}
}
