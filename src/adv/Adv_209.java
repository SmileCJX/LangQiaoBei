package adv;


public class Adv_209 {
	public static void main(String[] args) {
		boolean [] primes = new boolean[101];
		primes[0] = true;
		primes[1] = true;
		
		for (int i = 2; i < primes.length; i++) {
			if(!primes[i]){
				for (int j = i*2; j < primes.length; j=j+i) {
					primes[j] = true;
				}
			}
		}
		for(int i=2; i<100; i++){
			if(!primes[i]){
				System.out.println(i);
			}
		}
	}
}
