package algo;

import java.util.Scanner;

public class ALGO_9 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		System.out.println((int) (Math.pow(2, k) - k - 1) * 2);
	}
}
