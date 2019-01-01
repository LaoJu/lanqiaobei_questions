package basic;

import java.util.Scanner;

public class basic_18 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// 使用double存储避免精度损失
		double x1 = sc.nextDouble(), y1 = sc.nextDouble();
		double x2 = sc.nextDouble(), y2 = sc.nextDouble();
		double x3 = sc.nextDouble(), y3 = sc.nextDouble();
		double x4 = sc.nextDouble(), y4 = sc.nextDouble();

		double maxX_1 = Math.max(x1, x2), minX_1 = Math.min(x1, x2);
		double maxY_1 = Math.max(y1, y2), minY_1 = Math.min(y1, y2);
		double maxX_2 = Math.max(x3, x4), minX_2 = Math.min(x3, x4);
		double maxY_2 = Math.max(y3, y4), minY_2 = Math.min(y3, y4);

		// 判断矩形相离或者相交
		// 1.相离
		if (minX_2 >= maxX_1 || minX_1 >= maxX_2 || minY_1 >= maxY_2
				|| minY_2 >= maxY_1) {
			System.out.println("0.00");
		} else {
			// 2.相交
			double xx = Math.max(minX_1, minX_2), yy = Math.max(minY_1, minY_2);
			double x = Math.min(maxX_1, maxX_2), y = Math.min(maxY_1, maxY_2);
			System.out.println(String.format("%.2f",
					(Math.abs(x - xx) * Math.abs(y - yy))));
		}

	}

}
