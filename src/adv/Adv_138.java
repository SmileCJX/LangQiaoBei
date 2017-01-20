package adv;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adv_138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String [] name = new String[n];
		for (int i = 0; i < name.length; i++) {
			name[i] = sc.nextLine();
		}
		int m = Integer.parseInt(sc.nextLine());
		int [] score = new int[n];
		int [] score1 = new int[n];
		int [] p = new int[m];
		int DaDaScore = 0;
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				String [] ss = sc.nextLine().split(" ");
				if(map.get(ss[1]) != null){
					score[j] = map.get(ss[1])+Integer.parseInt(ss[0]);
					map.put(ss[1], score[j]);
				}else{
					score[j] = Integer.parseInt(ss[0]);
					map.put(ss[1], score[j]);
				}
				score1[j] = score[j];
				if(ss[1].equals("DaDa")){
					DaDaScore = score[j];
				}
			}
			Arrays.sort(score1);
			for (int j = score1.length-1; j >= 0; j--) {
				if(score1[j] == DaDaScore){
					p[i] = n-j;
					break;
				}
			}
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}

}
