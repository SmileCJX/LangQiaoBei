package test;

public class Test6A {
	public static void main(String[] args) {
		// ax+by = c a=4,b=-5,c=7
		// ax = c-by
		// 1.求出一个特殊解  x0 y0
		// 2.求通解：x = x0+bt,y=y0-at,t ... -2,-1,0,1,2,3..
		
		for(int y=0; y<100; y++){
			if((7-(-5*y))%4==0){
				System.out.println("y=" + y);
				System.out.println("x=" + (7-(-5*y))/4);
				break;
			}
		}
		
		// 4*x-5*y=7;
		
//		for(int x=0; x<100; x++)
//			for(int y=0; y<100; y++){
//				if(4*x - 5*y == 7) System.out.println(x+","+y);
//			}
	}	 
}
