package basic;

import java.util.Scanner;

public class basic_6 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		draw(num);
	}

	public static void draw(int num) {
		// �����ά����
		int[][] YH = new int[num][];
		for (int i = 0; i < num; i++) {
			YH[i] = new int[i + 1];
		}

		// ����ÿ��λ�õ�ֵ
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < YH[i].length; j++) {
				// ÿ����βΪ1
				YH[i][0] = 1;
				YH[i][i] = 1;

				if (i > 1 && j > 0 && j < i) {
					// ��һ�������ֵ���
					YH[i][j] = YH[i - 1][j] + YH[i - 1][j - 1];
				}
			}
		}

		// ���������
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < YH[i].length; j++) {
				System.out.print(YH[i][j] + " ");
			}
			System.out.println();
		}
	}

}
