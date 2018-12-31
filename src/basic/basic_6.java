package basic;

import java.util.Scanner;

public class basic_6 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		draw(num);
	}

	public static void draw(int num) {
		// 申请二维数组
		int[][] YH = new int[num][];
		for (int i = 0; i < num; i++) {
			YH[i] = new int[i + 1];
		}

		// 计算每个位置的值
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < YH[i].length; j++) {
				// 每行首尾为1
				YH[i][0] = 1;
				YH[i][i] = 1;

				if (i > 1 && j > 0 && j < i) {
					// 上一层的两个值相加
					YH[i][j] = YH[i - 1][j] + YH[i - 1][j - 1];
				}
			}
		}

		// 输出三角形
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < YH[i].length; j++) {
				System.out.print(YH[i][j] + " ");
			}
			System.out.println();
		}
	}

}
