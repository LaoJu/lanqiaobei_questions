package basic;

import java.util.Scanner;

public class basic_24 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int v1 = scanner.nextInt(); // �����ٶ�
		int v2 = scanner.nextInt(); // �ڹ��ٶ�
		int t = scanner.nextInt();
		int s = scanner.nextInt(); // ���ӵȴ�ʱ��
		int l = scanner.nextInt(); // �����̳���

		int s1 = 0;// ����·��
		int s2 = 0;// �ڹ�·��
		int time = 0;

		while (s1 < l && s2 < l) {
			if (s1 - s2 >= t) {// ����ͣ��
				if ((l - s2) / v2 < s) {// �ڹ굽�յ�
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
