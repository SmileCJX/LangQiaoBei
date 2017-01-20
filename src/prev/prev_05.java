package prev;

import java.util.Scanner;

public class prev_05 {
    static int hash[] = new int[100001];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int min = 100001, max = -1;
        int m = 0, n = 0;
        String strLine = cin.nextLine();
        while (N-- != 0) {
            strLine = cin.nextLine();
            Scanner s = new Scanner(strLine);
            while (s.hasNextInt()) {
                int t = s.nextInt();
                min = Math.min(t, min);
                max = Math.max(t, max);
                hash[t]++;
            }
        }
        for (int i = min; i <= max; i++) {
            if (hash[i] == 0)
                m = i;
            if (hash[i] == 2)
                n = i;
        }
        System.out.println(m + " " + n);
    }
}
