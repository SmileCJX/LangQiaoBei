package algo;

import java.util.Scanner;

public class Algo_038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//n名同学
		int m = sc.nextInt();//m个水龙头
		
		int [] w = new int[n];//i号同学的接水量为wi
		int [] t = new int[m]; //第i个水龙头的接水时间
		for(int i=0; i<n; i++){
			w[i] = sc.nextInt();
		}
		
		//分配前m个任务
		for(int i=0; i<m; i++){
			t[i] += w[i];
		}
		
		int temp = 0;
		int k = 0;
		int max = Integer.MIN_VALUE;
		//分配后n-m个任务
		for(int i=m; i<n; i++){
			temp = t[0];
			k=0; 
			for(int j=1; j<m;j++){ //确定空闲机器
				if(temp>t[j]){
					temp = t[j];
					k = j; //水龙头空闲
				}
			}
			
			t[k] += w[i];
			
			//确定完成所有接水所需要的时间
			for(int index=0; index<m; index++){
				if(max<t[index]){
					max = t[index];
				}
			}
			
		}
		System.out.println(max);
	}
}
