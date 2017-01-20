package adv;

public class Adv_101 {
	public static char [] result = {'A','B','C','D'};
	public static void main(String[] args) {
		
		for (int i=0; i<result.length; i++){
			isResult(i);
		}
	}
	
	public static void isResult(int i){
		int [] num = {0,0,0,0};
		num[i] = 1;
		
		if (num[1]+num[3]==1 && num[1]+num[2]==1 && num[0]+num[1]==1 && num[3]==0){
			System.out.println(result[i]);
			return;
		}
		if(!(num[1]+num[3]==1) && !(num[1]+num[2]==1) && !(num[0]+num[1]==1) && !(num[3]==0)){
			System.out.println(result[i]);
			return;
		}
	}
}
