package basic;

import java.util.Scanner;

public class basic_1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		if (isLeapYear(y)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean isLeapYear(int y) {
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			return true;
		}
		return false;
	}
}
