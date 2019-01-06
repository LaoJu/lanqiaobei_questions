package basic;

import java.util.Scanner;

public class basic_24 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int v1 = scanner.nextInt(); // 兔子速度
		int v2 = scanner.nextInt(); // 乌龟速度
		int t = scanner.nextInt();
		int s = scanner.nextInt(); // 兔子等待时间
		int l = scanner.nextInt(); // 总赛程长度

		int s1 = 0;// 兔子路程
		int s2 = 0;// 乌龟路程
		int time = 0;

		while (s1 < l && s2 < l) {
			if (s1 - s2 >= t) {// 兔子停下
				if ((l - s2) / v2 < s) {// 乌龟到终点
					time += (l - s2) / v2;
					s2 = l;
				} else {
					time += s;
					s2 += v2 * s;
				}
			} else {
				time++;
				s1 += v1;
				s2 += v2;
			}
		}

		if (s1 > s2) {
			System.out.println("R");
			System.out.println(time);
		} else if (s1 < s2) {
			System.out.println("T");
			System.out.println(time);
		} else {
			System.out.println("D");
			System.out.println(time);
		}

	}
}
