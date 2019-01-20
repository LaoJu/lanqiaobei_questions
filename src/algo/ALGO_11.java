package algo;

import java.util.Scanner;

public class ALGO_11 {
	public static int sum = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		getTime(k);
		System.out.println(sum);
	}

	public static void getTime(int k) {
		if (k == 0) {
			sum++;
			return;
		}
		if (k < 0) {
			return;
		}
		getTime(k - 1);
		getTime(k - 2);
	}
}
