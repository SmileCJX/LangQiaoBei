package adv;

public class Adv_187 {
	public static void main(String[] args) {
		for(int i=1; i<=1000; i++){
			for(int j=1; j<=1000-i; j++){
				if(i<=j){
					for(int k=1; k<=1000-i-j; k++){
						if((i*i+j*j)==k*k){
							System.out.println(i+" "+j+" "+k);
						}
					}
				}
			}
		}
	}
}
