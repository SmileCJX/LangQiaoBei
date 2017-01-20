package adv;
import java.util.Scanner;

public class Adv_013{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t--!=0){
			int n = scanner.nextInt();
			int [] num1 = new int[n];
			int [] num2 = new int[n];
			
			for (int i=0; i<num1.length; i++){
				num1[i] = scanner.nextInt();
			}
			
			for (int i=0; i<num2.length; i++){
				num2[i] = scanner.nextInt();
			}
			
			for (int i=0; i<num1.length-1; i++){
				for (int j=i+1; j<num1.length; j++){
					if (num1[i]>num1[j]){
						int temp = num1[i];
						num1[i] = num1[j];
						num1[j] = temp;
					}
				}
			}
			
			for (int i=0; i<num2.length-1; i++){
				for (int j=i+1; j<num2.length; j++){
					if (num2[i]<num2[j]){
						int temp = num2[i];
						num2[i] = num2[j];
						num2[j] = temp;
					}
				}
			}
			
			int result = 0;
			for (int i=0; i<n; i++){
				//System.out.println(num1[i]+"....."+num2[i]);
				result += num1[i]*num2[i];
			}
			
			System.out.println(result);
		}
	}
}