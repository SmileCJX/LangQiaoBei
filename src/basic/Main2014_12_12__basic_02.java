package basic;
/*
 * 
 * ��������
���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�

00000

00001

00010

00011

00100

�밴��С�����˳�������32��01����

�����ʽ
������û�����롣
�����ʽ
���32�У�����С�����˳��ÿ��һ������Ϊ5��01����
�������
00000
00001
00010
00011
<���²���ʡ��>
 */
public class Main2014_12_12__basic_02 {
	public static void main(String[] args) {
		for(int i1=0; i1<2; i1++)
			for (int i2=0; i2<2; i2++)
				for (int i3=0; i3<2; i3++)
					for (int i4=0; i4<2; i4++)
						for (int i5=0; i5<2; i5++){
							System.out.println(i1+""+i2+""+i3+""+i4+""+i5);
						}
	}
}