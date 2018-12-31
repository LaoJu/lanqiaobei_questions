package basic;

import java.util.Scanner;

public class basic_10 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String strHex = Integer.toHexString(num).toUpperCase();
		System.out.println(strHex);
	}
}
