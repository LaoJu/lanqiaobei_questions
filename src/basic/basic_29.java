package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_29 {

	static int len1;
	static int len2;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// 获取两个字符串
		String s1 = scanner.next();
		String s2 = scanner.next();

		// 转化成字符数组
		char[] ss1 = s1.toCharArray();
		char[] ss2 = s2.toCharArray();

		// 转化成int数组
		len1 = ss1.length;
		len2 = ss2.length;
		int[] num1 = new int[len1];
		int[] num2 = new int[len2];

		// 整型数组排序倒置
		for (int i = 0; i < len1; i++) {
			num1[i] = ss1[len1 - i - 1] - 48;
		}
		for (int i = 0; i < len2; i++) {
			num2[i] = ss2[len2 - i - 1] - 48;
		}

		List<Integer> sum = addTwo(num1, num2);
		int len = sum.size();
		for (int i = 0; i < len; i++) {
			System.out.print(sum.get(len - i - 1));
		}
	}

	public static List<Integer> addTwo(int[] num1, int[] num2) {
		List<Integer> addSum = new ArrayList<Integer>();
		int n = 0;// 进位
		int tempSum = 0;// 两位相加之和

		if (len1 >= len2) {

			for (int i = 0; i < len2; i++) {// 两串都有时
				tempSum = num1[i] + num2[i] + n;
				if (tempSum >= 10) {
					n = 1;
					addSum.add(tempSum % 10);
				} else {
					n = 0;
					addSum.add(tempSum);
				}
			}

			for (int j = len2; j < len1; j++) {// 一个数字的位数已经加完
				tempSum = num1[j] + n;
				if (tempSum >= 10) {
					n = 1;
					addSum.add(tempSum % 10);
				} else {
					n = 0;
					addSum.add(tempSum);
				}
			}

			if (n == 1) {
				addSum.add(1);
			}

		} else if (len1 < len2) {

			for (int i = 0; i < len1; i++) {// 两串都有时
				tempSum = num1[i] + num2[i] + n;
				if (tempSum >= 10) {
					n = 1;
					addSum.add(tempSum % 10);
				} else {
					n = 0;
					addSum.add(tempSum);
				}
			}

			for (int j = len1; j < len2; j++) {// 一个数字的位数已经加完
				tempSum = num2[j] + n;
				if (tempSum >= 10) {
					n = 1;
					addSum.add(tempSum % 10);
				} else {
					n = 0;
					addSum.add(tempSum);
				}
			}

			if (n == 1) {
				addSum.add(1);
			}
		}

		return addSum;

	}

}
