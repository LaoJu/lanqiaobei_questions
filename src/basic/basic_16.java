package basic;

import java.util.Scanner;

public class basic_16 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		getPrimeFactor(a, b);
	}

	public static void getPrimeFactor(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i >= 3) {
				String s = "";
				int k = 2;
				int j = i;
				while (j != k) {
					if (j % k == 0) {
						s = s + k + "*";
						j = j / k;
					} else {
						k++;
					}
				}
				s = s + k;
				System.out.println(i + "=" + s);
			} else {
				System.out.println(i + "=" + i);
			}
		}
	}
}
