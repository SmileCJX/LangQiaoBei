package algo;

import java.util.Scanner;

public class Algo_030 {
	public static void main(String[] args) {
		int m,n,i,v;
		int []w = new int[101];
		int []c = new int[101];
		int []f = new int[1001];
		
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();//�ܹ�������ҩ��ʱ��
		n = sc.nextInt();//ɽ����Ĳ�ҩ����Ŀ
		
		for (i=1; i<=n; i++){
			w[i] = sc.nextInt();//��ժĳ���ҩ��ʱ��
			c[i] = sc.nextInt();//��ҩ�ļ�ֵ
		}
		
		for(i=1; i<=n; i++){
			for(v=m; v>=w[i]; v--){
				if(f[v]<(f[v-w[i]])+c[i]){
					f[v]=f[v-w[i]]+c[i];
				}
			}
		}
		
		System.out.println(f[m]);
	}
}
