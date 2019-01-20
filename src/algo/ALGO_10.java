package algo;

import java.util.Scanner;
import java.util.TreeSet;

public class ALGO_10 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// 第一个集合的整数个数
		TreeSet<Integer> set_n = new TreeSet<Integer>();
		// 填充第一个集合
		while (n-- != 0) {
			set_n.add(scanner.nextInt());
		}

		int m = scanner.nextInt();// 第二个集合个数
		TreeSet<Integer> set_m = new TreeSet<Integer>();
		// 填充第二个集合
		while (m-- != 0) {
			set_m.add(scanner.nextInt());
		}

		// 1.求交集
		boolean flag = true;
		for (Integer temp : set_n) {
			if (set_m.contains(temp)) {
				if (flag) {
					System.out.print(temp);
				} else {
					System.out.print(" " + temp);
				}
				flag = false;
			}
		}
		System.out.println();

		// 2.求并集
		flag = true;
		TreeSet<Integer> set_temp = new TreeSet<Integer>();
		for (Integer i : set_n) {
			set_temp.add(i);
		}
		for (Integer j : set_m) {
			set_temp.add(j);
		}
		for (Integer temp : set_temp) {
			if (flag) {
				System.out.print(temp);
			} else {
				System.out.print(" " + temp);
			}
			flag = false;
		}
		System.out.println();

		// 3.求补集
		flag = true;
		for (Integer temp : set_n) {
			if (!set_m.contains(temp)) {
				if (flag) {
					System.out.print(temp);
				} else {
					System.out.print(" " + temp);
				}
				flag = false;
			}
		}
	}
}
