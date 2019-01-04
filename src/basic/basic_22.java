package basic;

import java.util.Scanner;

public class basic_22 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		show(n);
	}

	public static void show(int n) {
		if (n == 1) {
			System.out.print("A");
		} else if (n <= 26) {
			show(n - 1);
			System.out.print((char) (64 + n));
			show(n - 1);
		}
	}
}
