package begin;

import java.util.Scanner;

public class Begin_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int [] arr = new int[number+2];
		arr[1] = arr[2] = 1;
		int result =0;
		if(number==1){
			arr[number] = 1;
		}else if(number==2){
			arr[number] = 1;
		}else{
			for (int i=3; i<=number;i++){
				arr[i] = (arr[i-1]+arr[i-2]) % 10007;
			}
		}
		System.out.println(arr[number]);
	}
}
