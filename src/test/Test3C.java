package test;

public class Test3C {
	public static void main(String[] args) {
		int sum = 6;
		int [] a = {3,2,4,3,1};	
		boolean [] b = new boolean[a.length];  //��ʾa�Ķ�Ӧ���Ƿ�ѡȡ
		g(6,a,0,0,b);
	}
	
	// sum:�д�ĺ�
	// a:��ϸ
	// k:��ǰ�����λ��
	// cur_sum:ǰ�ߵ�Ԫ���ۼӺ�
	// b:��¼ȡ��
	public static void g(int err_sum,int[] a,int k,int cur_sum,boolean [] b){
		if(cur_sum > err_sum) return;
		
		if(err_sum == cur_sum){
			for(int i=0; i<b.length; i++){
				if(b[i]==false){
					System.out.print(i + " ");
				}
			}
			System.out.println();
			return;
		
		}
		
		if(k >= a.length) return;
		
		b[k] = false;
		g(err_sum,a,k+1,cur_sum,b);
		
		b[k] = true;
		cur_sum += a[k];
		g(err_sum,a,k+1,cur_sum,b);
		b[k] = false; //���ݣ�����
	}
}
