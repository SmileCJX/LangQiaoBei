package prev;

import java.util.Scanner;

public class prev_03 {
	static int kinds = 0;
	static int a[] = new int[10];
	static boolean vis[] = new boolean[10];

	static void check(int a[], int n, int num) {
		int begin = String.valueOf(num).length();
		String str = "";
		for (int i = 1; i < n; i++)
			str += a[i];
		for (int k = 1; k < begin + 1; k++) {
			int num1 = Integer.valueOf(str.substring(0, k));
			if (num1 < num) {
				for (int j = k + (n - k) / 2; j < n - 1; j++) {
					int num2 = Integer.valueOf(str.substring(k, j));
					int num3 = Integer.valueOf(str.substring(j, n - 1));
					if (num2 > num3 && num2 % num3 == 0) {
						if (num == num1 + num2 / num3) {
							kinds++;
						}
					}
				}
			}
		}
	}

	static void dfs(int start, int n, int num) {
		if (start == n) {
			check(a, n, num);
		} else {
			for (int i = 1; i < n; i++) {
				if (!vis[i]) {
					a[start] = i;
					vis[i] = true;
					dfs(start + 1, n, num);
					vis[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num = cin.nextInt();
		dfs(1, 10, num);
		System.out.println(kinds);
	}
}
