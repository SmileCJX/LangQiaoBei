package adv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Adv_105 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		String str = bfr.readLine();
		if (!str.contains(" ")){
			System.out.println("1");
			return;
		}
		StringTokenizer st = new StringTokenizer(str, " ", false);
		Set<String> set = new HashSet<String>();
		while (st.hasMoreElements()) {
			set.add(st.nextToken());
		}
		
		System.out.println(set.size());
	}
}
