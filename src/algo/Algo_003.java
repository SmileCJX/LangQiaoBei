package algo;

import java.util.Scanner;  

public class Algo_003 {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            int k = scanner.nextInt();  
            int l = scanner.nextInt();  
  
            int[][] nums = new int[l][k];  
  
            for (int i = 0; i < k; i++) {  
                nums[0][i] = 1;  
            }  
  
            for (int i = 1; i < l; i++) {  
                for (int j = 0; j < k; j++) {  
                    for (int x = 0; x < k; x++) {  
                        if (x != j - 1 && x != j + 1) {  
                        	
                            nums[i][j] += nums[i - 1][x];  
                            nums[i][j] %= 1000000007;  
                        }  
                    }  
                   
                }  
            }  
  
            int result = 0;  
            for (int i = 1; i < k; i++) {  
            	//System.out.println(nums[l - 1][i]);
                result += nums[l - 1][i];  
                result %= 1000000007;  
            }  
  
            System.out.println(result);  
        }  
    }  
}  
