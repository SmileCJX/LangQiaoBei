package adv;

import java.util.ArrayList;
import java.util.Scanner;

public class Adv_133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<7; i++){
			al.add(sc.nextInt());
		}
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		int price4 = 0; 
		int price5 = 0;
		int price6 = 0;
		int price7 = 0;
		int count = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<7; j++){
				if(al.contains(sc.nextInt())){
					count++;
				}
			}
			if(count==7){
				price1++;
			}else if(count==6){
				price2++;
			}else if(count==5){
				price3++;
			}else if(count==4){
				price4++;
			}else if(count==3){
				price5++;
			}else if(count==2){
				price6++;
			}else if(count==1){
				price7++;
			}
			count = 0;
		}
		System.out.println(price1+" "+price2+" "+price3+" "+price4+" "+price5+" "+price6+" "+price7);
	}
}
