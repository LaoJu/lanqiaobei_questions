package basic;

import java.util.Scanner;

public class basic_23 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		find(a, n);

	}

	public static void find(int[][] a, int n) {
		int num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num += a[j][i];
			}
			if (num > (n / 2)) {
				System.out.print((i + 1) + " ");
			}
			num = 0;
		}
	}
}
