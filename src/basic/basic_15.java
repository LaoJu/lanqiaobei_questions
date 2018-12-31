package basic;

import java.util.Scanner;

public class basic_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		char[] strs1 = str1.toCharArray();
		char[] strs2 = str2.toCharArray();

		// 判断情况1
		int len1 = strs1.length;
		int len2 = strs2.length;
		if (len1 != len2) {
			System.out.println("1");
			return;
		}

		int flag = 0;

		// 判断情况3
		if (flag == 0) {
			char[] lowStr1 = str1.toLowerCase().toCharArray();
			char[] lowStr2 = str2.toLowerCase().toCharArray();

			for (int i = 0; i < lowStr1.length; i++) {
				if (lowStr1[i] != lowStr2[i]) {
					flag = 4;
					System.out.println(flag);
					return;
				}

			}

			// 判断情况2
			if (flag == 0) {
				for (int i = 0; i < len1; i++) {
					if (strs1[i] != strs2[i]) {
						flag = 3;
					}
				}
				if (flag == 0) {
					flag = 2;
				}
			}

		}

		if (flag == 0) {
			flag = 4;
		}

		System.out.println(flag);

	}
}
