package basic;

public class Basic_07 {
	public static void main(String[] args) {
		for (int i=100; i<=999; i++){
			int bai = i/100;
			int shi = i/10%10;
			int ge = i%10;
			if (i == (int) ((Math.pow(bai, 3)+Math.pow(shi, 3)+Math.pow(ge, 3)))){
				System.out.println(i);
			}
		}
	}
}
