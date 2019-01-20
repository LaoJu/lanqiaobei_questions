package algo;

import java.util.Scanner;
import java.util.TreeSet;

public class ALGO_10 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// ��һ�����ϵ���������
		TreeSet<Integer> set_n = new TreeSet<Integer>();
		// ����һ������
		while (n-- != 0) {
			set_n.add(scanner.nextInt());
		}

		int m = scanner.nextInt();// �ڶ������ϸ���
		TreeSet<Integer> set_m = new TreeSet<Integer>();
		// ���ڶ�������
		while (m-- != 0) {
			set_m.add(scanner.nextInt());
		}

		// 1.�󽻼�
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

		// 2.�󲢼�
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

		// 3.�󲹼�
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
