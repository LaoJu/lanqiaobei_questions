package basic;

import java.util.Scanner;

public class basic_30 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[9999];
		scanner.close();

		a[0] = 1;
		int count = 0, count2 = 0;
		for (int i = 2; i <= n; i++) {
			int jw = 0;
			for (int j = 0; j < a.length; j++) {
				int temp = a[j] * i + jw;
				if (temp == 0 && i != 2 && count2 <= j)
					break;
				a[j] = temp % 10;
				jw = temp / 10;
				if (i != 2)
					count = j;
			}
			count2 = count;
		}
		for (int i = count; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
