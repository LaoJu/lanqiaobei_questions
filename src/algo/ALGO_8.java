package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TODO ���г�ʱ
public class ALGO_8 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();// n������
		int m = scanner.nextInt();// m�β���

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		int c, d1, d2;// �������������������
		int sum = 0;
		int max;
		List<Integer> result = new ArrayList<Integer>();

		for (int j = 0; j < m; j++) {
			c = scanner.nextInt();
			d1 = scanner.nextInt();
			d2 = scanner.nextInt();

			if (c == 1) {// �޸�Ȩֵ
				a[d1 - 1] = d2;
			}
			if (c == 2) {// ������һ�θ���Ȩֵ��
				for (int i = d1 - 1; i < d2; i++) {
					sum += a[i];
				}
				result.add(sum);
			}
			if (c == 3) {// ������һ�θ������ֵ
				max = a[d1 - 1];
				for (int i = d1; i < d2; i++) {
					if (max < a[i]) {
						max = a[i];
					}
				}
				result.add(max);
			}
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
