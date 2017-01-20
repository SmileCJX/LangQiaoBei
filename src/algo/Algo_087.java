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
    static int SubStringCnt(String str,String substr)//����һ���ִ����ַ���������ֵĴ���  
    {  
        int count=0;  
        for(int i=0;i<=str.length()-substr.length();i++)//ÿ������ƶ�һ��λ�õõ���ͬ���ִ������жϣ��������ƶ�substr�ĳ���  
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
        String str_obj=s.substring(0,L);//�ȼٶ���һ���ִ�ΪĿ���ִ�  
        int max_count=1;//���������ֵĴ�����0  
        for(int i=L;i<=s.length();i++)//����Ҫ���ڵ���L�Ķ�Ҫ����ѭ������  
        {  
            for(int t=0;t+i<=s.length();t++)//���ѭ�������٣��Ƕ�ÿ���ƶ�һ��λ�ú�ĵõ����ִ����¼�����ִ�����������  
            {  
                int tm=SubStringCnt(s,s.substring(t, t+i));  
                
                if(tm>max_count)//��ͬ�����£��������ִ�ֻ�г��ȴ���ǰ����ֵ�ʱ����ܽ��и�ֵ�����Ҹ������ֵ  
                {  
                    max_count=tm;  
                    str_obj=s.substring(t, t+i);  
                }  
                else if(tm==max_count)//����ڳ��ִ�����ͬ������£��ִ����ȶ��Ҫ�滻ԭ����  
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
