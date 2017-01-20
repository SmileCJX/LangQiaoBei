package adv;

import java.math.BigDecimal;
import java.util.Scanner;

public class Adv_018{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal num1 = sc.nextBigDecimal();
		BigDecimal num2 = sc.nextBigDecimal();
		System.out.println(num1.add(num2));
	}
}
//import java.util.*;    
//import java.math.*;    
//import java.io.*;    
//public class  Adv_018       
//{    
//    public static void main( String[] args  )    
//    {    
//       Scanner cin=new Scanner(new BufferedInputStream (System.in)  );      
//       BigInteger a,b,c;                     
//       int t,num=0;    
//       t=cin.nextInt();                    
//       while( t-->=1 )    
//       {    
//           num++;     
//           a=cin.nextBigInteger();                
//           b=cin.nextBigInteger();    
//           c=a.add(b);    
//           System.out.println("Case "+num+":");            
//           System.out.println(a + " + " + b + " = "+c);    
//           if(t!=0)System.out.println("");    
//       }    
//    }    
//}    