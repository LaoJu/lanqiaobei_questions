package basic;

import java.util.Scanner;

public class basic_26 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int min = scanner.nextInt();

		show(hour, min);
	}

	public static void show(int hour, int min) {
		String[] zeroToTwenty = { "zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen", "twenty", "twenty one",
				"twenty two", "twenty three" };

		String[] twentyToFifty = { "twenty", "thirty", "forty", "fifty" };

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23 };

		String minStr = String.valueOf(min);
		int[] c_min = new int[minStr.length()];
		for (int i = 0; i < minStr.length(); i++) {
			c_min[i] = minStr.charAt(i) - 48;
		}

		// 输出小时
		for (int i = 0; i < nums.length; i++) {
			if (hour == nums[i]) {
				System.out.print(zeroToTwenty[i] + " ");

			}
		}

		// 如果输入是0 0则在输出一个zero后退出
		if (min == 0) {
			System.out.println("o'clock");
			System.exit(0);
		}

		for (int j = 0; j < nums.length; j++) {
			if (min == nums[j]) {
				System.out.print(zeroToTwenty[j]);
				System.exit(0);
			}
		}

		for (int k = 2; k <= 5; k++) {
			if (c_min[0] == k) {
				System.out.print(twentyToFifty[k - 2] + " ");
				if (c_min[1] == 0) {
					System.exit(0);
				} else {
					for (int t = 1; t <= 9; t++) {
						if (c_min[1] == t) {
							System.out.print(zeroToTwenty[t]);
							System.exit(0);
						}
					}
				}

			}

		}
	}

}
