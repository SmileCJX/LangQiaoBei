package basic;

public class Main2014_12_12__01 {
	public static void main(String[] args) {
		for (int i=10; i<=99; i++){
			int temp = i/10+i%10*10;
			System.out.println(i*100+temp);
		}
	}
}
