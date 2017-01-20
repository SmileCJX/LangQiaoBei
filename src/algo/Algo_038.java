package algo;

import java.util.Scanner;

public class Algo_038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//n��ͬѧ
		int m = sc.nextInt();//m��ˮ��ͷ
		
		int [] w = new int[n];//i��ͬѧ�Ľ�ˮ��Ϊwi
		int [] t = new int[m]; //��i��ˮ��ͷ�Ľ�ˮʱ��
		for(int i=0; i<n; i++){
			w[i] = sc.nextInt();
		}
		
		//����ǰm������
		for(int i=0; i<m; i++){
			t[i] += w[i];
		}
		
		int temp = 0;
		int k = 0;
		int max = Integer.MIN_VALUE;
		//�����n-m������
		for(int i=m; i<n; i++){
			temp = t[0];
			k=0; 
			for(int j=1; j<m;j++){ //ȷ�����л���
				if(temp>t[j]){
					temp = t[j];
					k = j; //ˮ��ͷ����
				}
			}
			
			t[k] += w[i];
			
			//ȷ��������н�ˮ����Ҫ��ʱ��
			for(int index=0; index<m; index++){
				if(max<t[index]){
					max = t[index];
				}
			}
			
		}
		System.out.println(max);
	}
}
