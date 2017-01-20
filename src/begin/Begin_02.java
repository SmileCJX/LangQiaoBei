package begin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Begin_02 {
	public static void main(String[] args) {
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(
					System.in));
			long number = Integer.parseInt(bfr.readLine());
			long sum = (number + 1) * number / 2;
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
