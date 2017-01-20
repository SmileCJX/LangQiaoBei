package prev;

import java.util.Scanner;

public class prev_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0,b = 0,count = 0,x = 0;
		int s[] = new int[n];
		for(a=0; a<n; a++){
			s[a] = input.nextInt();
		}
		input.close();
		while(true){
			for(a=0; a<n; a++){
				s[a] = s[a]/2;
			}
			b = s[0];
			for (a=0; a<n-1; a++){
				s[a] = s[a]+s[a+1];
			}
			s[n-1] = s[n-1]+b;
			for (a=0,x=0; a<n; a++){
				if (s[a]%2!=0){
					s[a] = s[a]+1;
					count++;
				}else{
					x++;
				}
			}
			for (a=0; a<n-1; a++){
				if (s[a]!=s[a+1]){
					x=0;
				}
			}
			if (x==n){
				System.out.println(count);
				break;
			}
		}
	}
}
