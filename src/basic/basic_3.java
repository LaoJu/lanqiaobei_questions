package basic;

import java.util.Scanner;

public class basic_3 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		draw(n, m);
	}

	public static void draw(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 找出字符串规律
				// 对应位置字母为其坐标之差的绝对值与‘A’相加
				System.out.print((char) (Math.abs(i - j) + 'A'));
			}
			System.out.println();
		}
	}

}
