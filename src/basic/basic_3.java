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
				// �ҳ��ַ�������
				// ��Ӧλ����ĸΪ������֮��ľ���ֵ�롮A�����
				System.out.print((char) (Math.abs(i - j) + 'A'));
			}
			System.out.println();
		}
	}

}
