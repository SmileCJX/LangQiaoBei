package algo;

public class Algo_129 {
	public static void main(String[] args) {
		for(int i=1000; i<=9999; i++){
			char [] ch = (i+"").toCharArray();
			if(((ch[0]-'0')+(ch[1]-'0')+(ch[2]-'0')+(ch[3]-'0'))==10){
				System.out.println(i);
			}
		}
	}
}
