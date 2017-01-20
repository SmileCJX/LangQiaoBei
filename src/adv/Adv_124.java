package adv;

public class Adv_124 {
	public static char [] result = {'A','B','C','D','E','F'};
	
	public static void main(String[] args) {
		for (int i = 0; i < result.length; i++) {
			isResult(i);
		}
	}

	private static void isResult(int i) {
		int [] num = {0,0,0,0,0,0};
		num[i] = 1;
		if((num[0]!=0?1:0) + ((num[0]==1||num[2]==1)?1:0) + ((num[0]==1 && (num[0]!=1 && num[2]!=1))?1:0)
				+ ((!(num[0]==1 && (num[0]!=1 && num[2]!=1)) && (num[5]==0))?1:0)== 3){
			
		}
	}
}
