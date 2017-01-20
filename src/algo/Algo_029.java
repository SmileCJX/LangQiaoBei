package algo;

import java.util.Scanner;

public class Algo_029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l,m;
		l = sc.nextInt();
		m = sc.nextInt();
		int [] tree = new int[l+1];
		for (int i=0;i<tree.length; i++){
			tree[i] = 1;
		}
		
		int begin,end;
		for(int i=0; i<m; i++){
			begin = sc.nextInt();
			end = sc.nextInt();
			for( ;begin<=end;begin++){
				tree[begin] = 0;
			}
		}
		int result = 0;
		for(int i=0; i<tree.length; i++){
			if(tree[i]!=0){
				result++;
			}
		}
		
		System.out.println(result);
	}
}	
