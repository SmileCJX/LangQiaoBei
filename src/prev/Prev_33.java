package prev;

import java.util.Scanner;

public class Prev_33 {
	public static void main(String[] args) {
		//移动时，蚂蚁坐标的改变值
		int [] xx = {-1,0,1,0};
		int [] yy = {0,1,0,-1};
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] map = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				map[i][j] = sc.nextInt();
			}
		}
		//蚂蚁的初始坐标
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		String position = sc.next();
		int step = sc.nextInt();
		
		//将移动方向转换成数值
		int po = 0;
		if(position.equals("U")){
			po = 0;
		}else if(position.equals("R")){
			po = 1;
		}else if(position.equals("D")){
			po = 2;
		}else if(position.equals("L")){
			po = 3;
		}
		
		while(step!=0){
			if(map[x][y]==0){
				if(po==0){
					po = 3;
				}else{
					po--;
				}
			}else{
				po = (po+1)%4;
			}
			//黑白棋进行翻转
			map[x][y] = (map[x][y]+1)%2;
			
			//修改蚂蚁的坐标值
			x +=xx[po];
			y +=yy[po];
			
			step--;
		}
		
		System.out.println(x+" "+y);
	}
}
