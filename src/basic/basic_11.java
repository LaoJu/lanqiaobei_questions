package basic;

import java.util.Scanner;

public class basic_11 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String hexStr = scanner.nextLine();
		long dec = Long.parseLong(hexStr, 16);
		System.out.println(dec);
	}
}
