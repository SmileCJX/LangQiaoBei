package adv;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Adv_132 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		
		words = words.replaceAll(" ", "");
		
		Map<Character, Integer> alphabetCountMap = getCharMaps(words);
		Integer maxReduceMinAlphabetCount = reduceCount(alphabetCountMap);
		
		if(judgePrimeNumber(maxReduceMinAlphabetCount)){
			System.out.println("Lucky Word");
			System.out.println(maxReduceMinAlphabetCount.intValue());
		} else {
			System.out.println("No Answer");
			System.out.println(0);
		}
	}

	public static Map<Character, Integer> getCharMaps(String words){
		 Map<Character, Integer> alphabetCountMap = new HashMap<Character, Integer>();
		 for (int index = 0; index < words.length(); index++) {
			Character alphabet = words.charAt(index);
			Integer count = alphabetCountMap.get(alphabet);
			alphabetCountMap.put(alphabet, count==null ? 1 : count+1);
		}
		 
		 return alphabetCountMap;
	}
	
	private static Integer reduceCount(Map<Character, Integer> alphabetCountMap) {
		Iterator<Entry<Character, Integer>> iterator = alphabetCountMap.entrySet().iterator();
		
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		while (iterator.hasNext()) {
			Entry<Character,Integer> entry = iterator.next();
			if(min.intValue() > entry.getValue().intValue()){
				min = entry.getValue();
			}
			if(max.intValue() < entry.getValue().intValue()){
				max = entry.getValue();
			}
		}
		return max.intValue() - min.intValue();
	}
	
	private static boolean judgePrimeNumber(Integer maxReduceMinAlphabetCount) {
		int maxReduceMinAlphaCountValue = maxReduceMinAlphabetCount.intValue();
		
		if(maxReduceMinAlphaCountValue == 1 || maxReduceMinAlphaCountValue ==  0){
			return false;
		}
		
		for (int i = 2; i < (int)Math.sqrt(maxReduceMinAlphaCountValue)+1; i++) {
			if (maxReduceMinAlphaCountValue % i == 0){
				return false;
			}
		}
		return true;
	}
}
