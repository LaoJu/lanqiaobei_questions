package basic;

import java.util.Scanner;

public class basic_17 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}

		int result[][] = new int[n][n];
		// 判断幂是否为0 如果为零 则输出单位矩阵
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == j) {
						result[i][i] = 1;
					} else {
						result[i][j] = 0;
					}
				}

			}
		} else {
			// 循环计算阶乘
			result = a;
			for (int time = 1; time < m; time++) {
				result = multMatrix(result, a);
			}
		}

		printMatrix(result);

	}

	// 矩阵相乘
	public static int[][] multMatrix(int[][] a, int[][] b) {
		int len = a.length;
		int result[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < len; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	// 打印矩阵
	public static void printMatrix(int a[][]) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
