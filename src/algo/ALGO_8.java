package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TODO 运行超时
public class ALGO_8 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// n个格子
		int m = scanner.nextInt();// m次操作

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int c, d1, d2;// 定义操作和两个操作数
		int sum = 0;
		int max;
		List<Integer> result = new ArrayList<Integer>();

		for (int j = 0; j < m; j++) {
			c = scanner.nextInt();
			d1 = scanner.nextInt();
			d2 = scanner.nextInt();

			if (c == 1) {// 修改权值
				a[d1 - 1] = d2;
			}
			if (c == 2) {// 求连续一段格子权值和
				for (int i = d1 - 1; i < d2; i++) {
					sum += a[i];
				}
				result.add(sum);
			}
			if (c == 3) {// 求连续一段格子最大值
				max = a[d1 - 1];
				for (int i = d1; i < d2; i++) {
					if (max < a[i]) {
						max = a[i];
					}
				}
				result.add(max);
			}
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
