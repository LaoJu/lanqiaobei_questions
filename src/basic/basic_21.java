package basic;

import java.util.Scanner;

public class basic_21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(s(n, 1));
	}

	static String s(int n, int i) {
		if (i == n) {
			return "" + An(n) + "+" + (n - i + 1);
		} else {
			return "(" + An(i) + "+" + (n - i + 1) + ")" + "" + s(n, i + 1)
					+ "";
		}
	}

	static String An(int n) {
		return sin(n, 1);
	}

	static String sin(int n, int i) {
		if (i == n) {
			return "sin(" + n + ")";
		} else {
			if (i % 2 == 0)
				return "sin(" + i + "+" + sin(n, i + 1) + ")";
			else {
				return "sin(" + i + "-" + sin(n, i + 1) + ")";
			}
		}

	}
}