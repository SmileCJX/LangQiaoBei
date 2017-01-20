package algo;

import java.util.Scanner;  

public class Algo_017 {  

    public static void main(String[] args) {  
        Scanner scanner=new Scanner(System.in);  
        int n =scanner.nextInt();  
        int k =scanner.nextInt();  
        String str=scanner.next();  
        int array[]=strToArray(str,n);  
        System.out.println(getResult(array, 0, k));  
    }  
    public static int[] strToArray(String str,int n){  
        int array[]=new int[n];  
        for(int i=0;i<str.length();i++){  
            array[i]=str.charAt(i)-48;  
        }  
        return array;  
    }  
    public static int getResult(int array[],int begin,int k){  
        if(k==0){  
            return getIntFromArray(array, begin, array.length-1);  
        }else{  
            int result=0;  
            for(int i=begin;i<array.length;i++){  
                int x=getIntFromArray(array, begin, i)*getResult(array, i+1, k-1);  
                if(x>result){  
                    result=x;  
                }  
            }  
            return result;  
        }  
    }  
    public static int getIntFromArray(int array[],int begin,int i){  
        int sum=0;  
        while(begin<=i){  
            sum=sum*10+array[begin];  
            begin++;  
        }  
        return sum;  
    }  
}  