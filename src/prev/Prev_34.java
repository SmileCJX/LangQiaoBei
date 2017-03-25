package prev;


/*
 * ���⿴����һ��ģ���⣬���������ݹ�ģ�ܴ�10��1000�η�����ֻ���ҹ��ɡ����������ս��Ϊsqrt(n)*sqrt(m)��Ȼ�����ͳ��˴����������⡣

�������ȶ����ֵĳ��Ƚ����жϣ����������������ż��λ�ģ�����4365��4λ�����������Ϊ��ԭλ����һ�루66��2λ���������λ��������λ�ģ�����121��3λ������������λ������ԭλ���Ķ���֮һ���������ټ�һ��11��3/2+1=2λ����

ȷ����λ��֮��Ͷ�������ɸ�λ����λ����С����ı�����

��4356Ϊ������ȷ��������λ�ģ���ʼ��Ϊ00����ʮλ��ʼ1-9�ı�������70��ʱ�������ƽ��Ϊ4900>4356���Ӷ�ȷ��ʮλ��7-1=6����λͬ��
 */
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Prev_34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		BigInteger ans1 = BigSqrt(s1);
		BigInteger ans2 = BigSqrt(s2);
		
		BigInteger ans = ans1.multiply(ans2);
		System.out.println(ans);
	}

	private static BigInteger BigSqrt(String s) {
	    int mlen = s.length();   //���������ĳ���
	    int len = 0; //������ĳ��ȳ�ʼ��
	    if(mlen % 2 == 0){
	    	len = mlen / 2;
	    } else {
	    	len =mlen / 2 + 1;
	    }
	    
	    
	    BigInteger beSqrtNum = new BigInteger(s);  //��������
	    BigInteger sqrtOfNum; //�洢���������
	    BigInteger sqrtOfNumMul; //��������ƽ����
	    String sString; //�洢sArrayת������ַ���
	    char [] sArray = new char[len];
	    Arrays.fill(sArray, '0');  //��������ʼ��Ϊ0
	    
	    for (int pos = 0; pos < len; pos++) {
	    	//����߿�ʼ�������飬ÿһλ��ת��Ϊ������ƽ����պò����ڱ��������ĳ̶�
			for (char num = '1'; num <= '9'; num++) {
				sArray[pos] = num;
				sString = String.valueOf(sArray);
				sqrtOfNum = new BigInteger(sString);
				sqrtOfNumMul = sqrtOfNum.multiply(sqrtOfNum);
				
				if(sqrtOfNumMul.compareTo(beSqrtNum) == 1){
					sArray[pos] -= 1;
					break;
				}
			}
		}
	    
		return new BigInteger(String.valueOf(sArray));
	}
}
