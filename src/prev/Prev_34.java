package prev;


/*
 * 此题看似是一道模拟题，但由于数据规模很大（10的1000次方），只能找规律。规律是最终结果为sqrt(n)*sqrt(m)，然后此题就成了大数开根的题。

做法是先对数字的长度进行判断，如果被开根的数是偶数位的（例如4365，4位），开根后就为其原位数的一半（66，2位）。如果其位数是奇数位的（例如121，3位），开根后其位数就是原位数的二分之一向下区整再加一（11，3/2+1=2位）。

确定了位数之后就对其进行由高位至低位，由小到大的遍历。

以4356为例，先确定答案是两位的，初始化为00，从十位开始1-9的遍历，到70的时候该数的平方为4900>4356，从而确定十位是7-1=6。个位同理。
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
	    int mlen = s.length();   //被开方数的长度
	    int len = 0; //开方后的长度初始化
	    if(mlen % 2 == 0){
	    	len = mlen / 2;
	    } else {
	    	len =mlen / 2 + 1;
	    }
	    
	    
	    BigInteger beSqrtNum = new BigInteger(s);  //被开方数
	    BigInteger sqrtOfNum; //存储开方后的数
	    BigInteger sqrtOfNumMul; //开方数的平方；
	    String sString; //存储sArray转化后的字符串
	    char [] sArray = new char[len];
	    Arrays.fill(sArray, '0');  //开方数初始化为0
	    
	    for (int pos = 0; pos < len; pos++) {
	    	//从最高开始遍历数组，每一位都转化为开方数平方后刚好不大于被开方数的程度
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
