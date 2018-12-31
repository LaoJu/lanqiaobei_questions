package basic;

import java.util.Scanner;

public class basic_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		int n1 = time / 3600;
		int n2 = time % 3600 / 60;
		int n3 = time % 60;
		System.out.println(n1 + ":" + n2 + ":" + n3);
	}
}
