package test;

/*
 * 30�˵İ༶�����������ظ��ĸ����ж��
 */
public class Test7A {
	public static void main(String[] args) {
		//����ģ��
		//0-365 �������������
		final int N = 1000*100;
		int n = 0;
		
		for(int i=0; i<N; i++){
			int[] x = new int[365];
			for(int j=0; j<30; j++){
				int p = (int)(Math.random()*365);
				if(x[p]==1){
					n++;
					break;
				}else{
					x[p] = 1;
				}
			}
		}
		
		double r = (double)n/N;
		System.out.println(r);
	}
}
