package test;
/*
 * ÿ���˴Ӻ�����ȡ���������Ŀ������1,3,7����8����
 * �ֵ�ĳһ��ȡ��ʱ������Ȩ��
 * A��ȡ��Ȼ��˫������ȡ��ֱ��ȡ�ꡣ
 * �����õ����һ�����һ��Ϊ�������䷽��
 * ˫������������������ж�
 */
/*
 * f(���� x)--->ʤ����
 * �߽�������������
 * for(�������п��ܵ��߷�{
 * 		������һ��----->����y
 * 		ʤ�� t= f(y);
 * 		if(t==��) return ʤ
 * 		�ָ�����
 * }
 * return ��
 */
public class Test8A {
	public static void main(String[] args) {
		System.out.println(f(10));
		System.out.println(f(1));
		System.out.println(f(4));
	}

	//���棺n ��ʣ����Ŀ
	private static boolean f(int n) {
		if(n>=1 && f(n-1)==false) return true;
		if(n>=3 && f(n-3)==false) return true;
		if(n>=7 && f(n-7)==false) return true;
		if(n>=8 && f(n-8)==false) return true;
		return false;	//Ч�ʲ��ߡ��û��壬�Ѿ�������ľ��汣��
	}
}
