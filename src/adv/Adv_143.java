package adv;

public class Adv_143 {

	public static void main(String[] args) {
		char man;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			man = (char) ('A'+i);
			sum = (man != 'A' && man != 'E' ? 1:0)+(man == 'C' || man == 'E' ? 1:0)+
					(man == 'C' || man == 'D' ? 1:0)+(man != 'B' && man != 'C' ? 1:0)+
					(man != 'E' ? 1:0);
			if(sum == 2){
				System.out.print(man+" ");
			}
		}
	}

}
