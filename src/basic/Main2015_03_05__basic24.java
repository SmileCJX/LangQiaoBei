package basic;

import java.util.Scanner;

public class Main2015_03_05__basic24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int t = input.nextInt();
		int s = input.nextInt();
		int l = input.nextInt();
		
		int s1 = 0,s2 = 0,time = 0;
		while(s1<l && s2<l){
			if (s1-s2>=t){
				if ((l-s2)/v2<s){
					time += (l-s2)/v2;
					s2 = l;
				}else{
					time +=s;
					s2 += v2*s;
				}
			}else{
				time++;
				s1 += v1;
				s2 += v2;
			}
		}
		
		if (s1>s2){
			System.out.println("R");
		}else if(s1<s2){
			System.out.println("T");
		}else if(s1==s2){
			System.out.println("D");
		}
		System.out.println(time);
	}
}
/*import java.util.Scanner;  

public class Main2015_03_05__basic24 {  
  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
  
        while (scanner.hasNext()) {  
            int v1 = scanner.nextInt();  
            int v2 = scanner.nextInt();  
            int t = scanner.nextInt();  
            int s = scanner.nextInt();  
            int l = scanner.nextInt();  
  
            int s1 = 0, s2 = 0, time = 0;  
            while (s1 < l && s2 < l) {  
                if (s1 - s2 >= t) {  
                    if ((l - s2) / v2 < s) {  
                        time += (l - s2) / v2;  
                        s2 = l;  
                    } else {  
                        time += s;  
                        s2 += v2 * s;  
                    }  
                } else {  
                    time++;  
                    s1 += v1 * 1;  
                    s2 += v2 * 1;  
                }  
            }  
  
            if (s1 > s2) {  
                System.out.println("R");  
            } else if (s1 < s2) {  
                System.out.println("T");  
            } else {  
                System.out.println("D");  
            }  
            System.out.println(time);  
        }  
    }  
}  
*/