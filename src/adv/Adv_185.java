package adv;

public class Adv_185 {
	public static void main(String[] args) {
		int ge;
		int shi;
		int bai;
		int qian;
		int wan;
		int shiwan;
		int temp;
		for(int i=10; i<999999; i++){
			ge = i%10;
			temp = i/10;
		    shi = temp%10;
			temp = temp/10;
			bai = temp%10;
			temp = temp/10;
			qian = temp%10;
			temp = temp/10;
			wan = temp%10;
			temp = temp/10;
			shiwan = temp;
			if((int)Math.pow(ge, 5)>i){
				ge = 0;
				shi = 0;
				bai = 0;
				qian = 0;
				wan = 0;
				shiwan = 0;
				continue;
			}else if((int)Math.pow(shi, 5)>i){
				continue;
			}else if((int)Math.pow(bai, 5)>i){
				continue;
			}else if((int)Math.pow(qian, 5)>i){
				continue;
			}else if((int)Math.pow(wan, 5)>i){

				continue;
			}else if((int)Math.pow(shiwan, 5)>i){
				continue;
			}else if(((int)Math.pow(ge, 5)+(int)Math.pow(shi, 5)+(int)Math.pow(bai, 5)+(int)+Math.pow(qian, 5)+(int)Math.pow(wan, 5)+(int)Math.pow(shiwan, 5))==i){
//				System.out.println(ge+" "+shi+" "+bai+" "+qian+" "+wan+" "+shiwan);
				System.out.println(i);
			}

		}
	}
}
