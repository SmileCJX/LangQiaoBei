package basic;
/*
 * ��������
����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
�����ʽ
��������С�����˳�����������������λʮ��������ÿ����ռһ�С�
 * 
 */
public class Main2014_12_12_basic_07 {
	public static void main(String[] args) {
		for (int i=100; i<=999; i++){
			method(i);
		}
	}
	
	public static void method(int i){
		int qian = i/100;
		int shi = i%100/10;
		int ge = i%10;
		if (qian*qian*qian+shi*shi*shi+ge*ge*ge==i){
			System.out.println(i);
		}
	}
}
