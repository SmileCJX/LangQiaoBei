package basic;



/*
 * ��������
����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
�����ʽ
��������һ�У�����һ��������n��
�����ʽ
��������С�����˳���������������������ÿ������ռһ�С�
��������
52
�������
899998
989989
998899
���ݹ�ģ��Լ��
����1<=n<=54��
 */

/*
 * 		for (int i=10; i<99; i++){
			if (method1(i,n)){
				System.out.println(i);
			}
		}
	}
	public static boolean method1(int i,int n){
		for (int j=0; j<10; j++){
			int temp = i*1000+j*100+i%10*10+i/10;
			if (n==temp){
				return true;
			}
		}
		return false;
 */
import java.util.Scanner;
public class Main2014_12_12__02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i=10000; i<=999999; i++){
			if (sum(i,n)&&huiwen(i)){
				System.out.println(i);
			}
		}
	}
	
	public static boolean sum(int i,int n){
		String s = String.valueOf(i);
		int result = 0;
		for (int j=0; j<s.length();j++){
			result +=s.charAt(j)-48;
		}
		return result==n;
	}
	
	public static boolean huiwen(int i){
		String str = trans(i);
		for (int j=0; j<str.length(); j++){
			if (str.charAt(j)!=str.charAt(str.length()-1-j)){
				return false;
			}
		}
		return true;
	}
	
	public static String trans(int i){
		int a = i;
		String res = "";
		while(a!=0){
			int b = a % 10;
			res = b+res;
			a = a/10;
		}
		return res;
	}
}
