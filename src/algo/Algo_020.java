package algo;

import java.util.Scanner;  

public class Algo_020 {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            String str1 = scanner.nextLine();  
            String str2 = scanner.nextLine();  
  
            showResult(str1, str2);  
            System.out.println();  
        }  
    }  
  
    private static void showResult(String str1, String str2) {  
        char chl = str2.charAt(str2.length() - 1);  
        System.out.print(chl);  
  
        int index = str1.indexOf(chl);  
  
        if (index > 0) {  
            showResult(str1.substring(0, index), str2.substring(0, index));  
        }  
  
        if (index < str1.length() - 1) {  
            showResult(str1.substring(index + 1), str2.substring(index, str2.length() - 1));  
        }  
    }  
}  
