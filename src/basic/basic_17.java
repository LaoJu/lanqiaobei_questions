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
		// �ж����Ƿ�Ϊ0 ���Ϊ�� �������λ����
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
			// ѭ������׳�
			result = a;
			for (int time = 1; time < m; time++) {
				result = multMatrix(result, a);
			}
		}

		printMatrix(result);

	}

	// �������
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

	// ��ӡ����
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
