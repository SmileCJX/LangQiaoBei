package adv;

import java.util.Scanner;

public class Adv_146 {
	public static final int [][] arr = {
		{0, 4, 3, 3, 4, 3, 2, 3, 1, 2},  
        {4, 0, 5, 3, 2, 5, 6, 1, 5, 4},  
        {3, 5, 0, 2, 5, 4, 3, 4, 2, 3},  
        {3, 3, 2, 0, 3, 2, 3, 2, 2, 1},  
        {4, 2, 5, 3, 0, 3, 4, 3, 3, 2},  
        {3, 5, 4, 2, 3, 0, 1, 4, 2, 1},  
        {2, 6, 3, 3, 4, 1, 0, 5, 1, 2},  
        {3, 1, 4, 2, 3, 4, 5, 0, 4, 3},  
        {1, 5, 2, 2, 3, 2, 1, 4, 0, 1},  
        {2, 4, 3, 1, 2, 1, 2, 3, 1, 0}  
	};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		String a = scanner.next();
		String b = scanner.next();
		
		int result = 0;
		for (int i = 0; i < l; i++) {
			result += arr[ Integer.valueOf( (byte)a.charAt(i)-(byte)'0' ) ][ Integer.valueOf( (byte)b.charAt(i)-(byte)'0' ) ];
		}
		
		System.out.println(result);
	}
}
