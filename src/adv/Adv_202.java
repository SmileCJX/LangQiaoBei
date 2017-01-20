package adv;

/*问题描述
给定两个字符串，寻找这两个字串之间的最长公共子序列。
输入格式
输入两行，分别包含一个字符串，仅含有小写字母。
输出格式
最长公共子序列的长度。
样例输入
abcdgh
aedfhb
样例输出
3
样例说明
最长公共子序列为a，d，h。
数据规模和约定
字串长度1~1000。*/
import java.util.Scanner;

public class Adv_202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int [][] martix = new int[str1.length()+1][str2.length()+1];
		for(int i=1; i<=str1.length(); i++){
			for(int j=1; j<=str2.length(); j++){
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					martix[i][j] = martix[i-1][j-1]+1;
				}else{
					if(martix[i-1][j] >= martix[i][j-1]){
						martix[i][j] = martix[i-1][j];
					}else{
						martix[i][j] = martix[i][j-1];
					}
				}
			}
		}
		System.out.println(martix[str1.length()][str2.length()]);
	}
}
