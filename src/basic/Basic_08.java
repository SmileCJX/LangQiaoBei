package basic;

public class Basic_08 {
	public static void main(String[] args) {
		for (int i=10; i<=99; i++){
			int temp = i%10*10+i/10;
			System.out.println(i*100+temp);
		}
	}
}
