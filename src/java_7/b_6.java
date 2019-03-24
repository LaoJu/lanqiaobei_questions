package java_7;

import java.lang.Math;

/*
 方格填数

 如下的10个格子
 +--+--+--+
 |  |  |  |
 +--+--+--+--+
 |  |  |  |  |
 +--+--+--+--+
 |  |  |  |
 +--+--+--+

 （如果显示有问题，也可以参看【图1.jpg】）

 填入0~9的数字。要求：连续的两个数字不能相邻。
 （左右、上下、对角都算相邻）

 一共有多少种可能的填数方案？

 请填写表示方案数目的整数。
 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。*/
public class b_6 {
	static int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static int ans = 0;

	public static void main(String args[]) {
		f(0);
		System.out.println(ans);
	}

	static void f(int k) {
		if (k == 9) {
			if (check()) {
				ans++;
			}
			return;
		}

		for (int i = k; i < 10; i++) {//注意i[k,10)
			int t = a[i];
			a[i] = a[k];
			a[k] = t;

			f(k + 1);

			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}

	static boolean check() {
		if (Math.abs(a[0] - a[1]) == 1 || Math.abs(a[0] - a[3]) == 1
				|| Math.abs(a[0] - a[4]) == 1 || Math.abs(a[0] - a[5]) == 1 ||

				Math.abs(a[1] - a[2]) == 1 || Math.abs(a[1] - a[4]) == 1
				|| Math.abs(a[1] - a[5]) == 1 || Math.abs(a[1] - a[6]) == 1 ||

				Math.abs(a[2] - a[5]) == 1 || Math.abs(a[2] - a[6]) == 1 ||

				Math.abs(a[3] - a[4]) == 1 || Math.abs(a[3] - a[7]) == 1
				|| Math.abs(a[3] - a[8]) == 1 ||

				Math.abs(a[4] - a[5]) == 1 || Math.abs(a[4] - a[7]) == 1
				|| Math.abs(a[4] - a[8]) == 1 || Math.abs(a[4] - a[9]) == 1 ||

				Math.abs(a[5] - a[6]) == 1 || Math.abs(a[5] - a[8]) == 1
				|| Math.abs(a[5] - a[9]) == 1 ||

				Math.abs(a[6] - a[9]) == 1 ||

				Math.abs(a[7] - a[8]) == 1 ||

				Math.abs(a[8] - a[9]) == 1)
			return false;
		return true;
	}

}
