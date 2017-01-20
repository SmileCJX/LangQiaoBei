package algo;

import java.util.Scanner;

public class Algo_066 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		String [] arr = str2.split(" ");
		if (!str1.contains(arr[1])){
			System.out.println("指定字符不存在");
		}else if (arr[0].equalsIgnoreCase("D")){
			int i = str1.indexOf(arr[1]);
			str1 = str1.substring(0,i)+str1.substring(i+1);
			System.out.println(str1);
		}else if (arr[0].equalsIgnoreCase("R")){
			str1 = str1.replace(arr[1], arr[2]);
			System.out.println(str1);
		}else if (arr[0].equalsIgnoreCase("I")){
			int i = str1.lastIndexOf(arr[1]);
			StringBuilder sb = new StringBuilder(str1);
			System.out.println(sb.insert(i, arr[2]));
		}
	}
}
