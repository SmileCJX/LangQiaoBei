package test;

/*
 * 30人的班级，出现生日重复的概论有多大
 */
public class Test7A {
	public static void main(String[] args) {
		//概论模拟
		//0-365 随机产生的数字
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
