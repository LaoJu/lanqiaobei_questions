package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ALGO_12 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String str = dget(n);
		System.out.println(str);
	}

	// 递归获取表达式
	public static String dget(int n) {
		List<Integer> numList = new ArrayList<Integer>();
		String str = new String("");
		int temp;
		int u = n;

		while (true) {
			// 转化成二进制
			temp = u % 2;
			u = u / 2;
			numList.add(temp);
			if (u == 0) {
				break;
			}
		}

		int count = 0;
		for (int i = numList.size() - 1; i >= 0; i--) {

			if (numList.get(i) == 1) {
				if (count > 0) {
					str = str + "+";
				}
				if (i == 1) {
					str = str + "2";
				}
				if (i == 0) {
					str = str + "2(0)";
				}
				if (i != 0 && i != 1) {
					str = str + "2(" + dget(i) + ")";
				}
				count = 1;
			}
		}
		return str;
	}
}
