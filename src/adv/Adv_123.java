package adv;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adv_123 {
	public static void main(String[] args) throws Exception{
		/*Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double m1 = input.nextDouble();
		String str = input.next();
		double n2 = input.nextDouble();
		double m2 = input.nextDouble();*/
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = bfr.readLine();
		String [] arr = str.split(" ");
		double n1 = Integer.parseInt(arr[0]);
		double m1 = Integer.parseInt(arr[1]);
		double n2 = Integer.parseInt(arr[3]);
		double m2 = Integer.parseInt(arr[4]);
	/*	System.out.println(n1);
		System.out.println(m1);
		System.out.println(arr[2]);
		System.out.println(n2);
		System.out.println(m2);*/
		method(n1,m1,str,n2,m2);
	}
	
	public static void method(double n1,double m1,String str,double n2,double m2){
		switch (str){
		case "+":
			System.out.println((n1+n2)+((m1+m2==0)?"":(m1+m2>0)?"+"+(m1+m2)+"i":(m1+m2+"i")));
			break;
		case "-":
			System.out.println((n1-n2)+((m1-m2==0)?"":(m1-m2>0)?"+"+(m1-m2)+"i":(m1-m2+"i")));
			break;
		case "*":
			//System.out.println((n1*n2-m1*m2)+((n1*m2+m1*n2>=0)?"+":"-")+(Math.abs(n1*m2+m1*n2))+"i");
			System.out.println((n1*n2-m1*m2)+((n1*m2+m1*n2==0)?"":(n1*m2+m1*n2)+"i"));
			break;
		case "/":
			System.out.println(((n1*n2+m1*m2)/(n2*n2+m2*m2)+(m1*n2-n1*m2)/(n2*n2+m2*m2)==0)?"":(((n1*n2+m1*m2)/(n2*n2+m2*m2)+(m1*n2-n1*m2)/(n2*n2+m2*m2)>0)?"+"+(n1*n2+m1*m2)/(n2*n2+m2*m2)+(m1*n2-n1*m2)/(n2*n2+m2*m2)+"i":((n1*n2+m1*m2)/(n2*n2+m2*m2)+(m1*n2-n1*m2)/(n2*n2+m2*m2)+"i")));
			break;
		}
	}
}
