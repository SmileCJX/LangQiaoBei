package algo;

import java.util.Scanner;

public class Algo_087 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		String s = input.next();
		
		String str = s.substring(0,l);
		int max = 0;
		
		for (int i=l; i<s.length(); i++){
			for (int t=0; t+i<=s.length(); t++){
				int tm = method(s,s.substring(t, t+i));
				
				if (tm>max){
					max = tm;
					str = s.substring(t,t+i);
				}else if(tm==max){
					if(str.length()<i){
						str = s.substring(t,t+i);
					}
				}
			}
		}
		System.out.println(str);
	}
	
	public static int method(String s,String sub){
		int count = 0;
		for (int i=0; i<=s.length()-sub.length(); i++){
			if (sub.equals(s.substring(i, i+sub.length()))){
				count++;
			}
		}
		return count;
	}
}


/*import java.util.*;    
import java.math.*;  
public class Main2015_02_17__algo87  
{  
    static int SubStringCnt(String str,String substr)//计算一个字串在字符串里面出现的次数  
    {  
        int count=0;  
        for(int i=0;i<=str.length()-substr.length();i++)//每次向后移动一个位置得到不同的字串进行判断，而不是移动substr的长度  
        {  
            if(substr.equals(str.substring(i, i+substr.length())))  
            {  
                count++;  
            }  
        }  
        return count;  
    }  
    public static void main(String[] args)  
    {  
        Scanner sc=new Scanner(System.in);  
        int L=sc.nextInt();  
        String s=sc.next();  
        String str_obj=s.substring(0,L);//先假定第一个字串为目标字串  
        int max_count=1;//假设最多出现的次数是0  
        for(int i=L;i<=s.length();i++)//长度要大于等于L的都要进行循环计算  
        {  
            for(int t=0;t+i<=s.length();t++)//这层循环不能少，是对每次移动一个位置后的得到的字串重新计算出现次数，不可少  
            {  
                int tm=SubStringCnt(s,s.substring(t, t+i));  
                
                if(tm>max_count)//相同长度下，后来的字串只有长度大于前面出现的时候才能进行赋值，并且更新最大值  
                {  
                    max_count=tm;  
                    str_obj=s.substring(t, t+i);  
                }  
                else if(tm==max_count)//如果在出现次数相同的情况下，字串长度多的要替换原来的  
                {  
                    if(str_obj.length()<i)  
                    {  
                        str_obj=s.substring(t,t+i);  
                    }  
                }  
            }  
        }  
        System.out.println(str_obj);  
    }  
}  */
