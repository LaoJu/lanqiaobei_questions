package algo;

import java.util.*;

public class ALGO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		// ��һ���֣��������еĳ��ȼ�����
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		// �ڶ����֣������ѯ�ĸ���m,���䷶Χ��l��r��,�Լ�k��ֵ
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			// �������֣���l��r������䷶Χ��ֵ���뵽����b��
			int[] b = new int[r - l + 1];
			int e = 0;
			for (int j = l - 1; j <= r - 1; j++) {
				b[e++] = a[j];
			}
			// ���Ĳ��֣�������b��������,����Ҫ�����
			for (int q = 0; q < b.length; q++) {
				for (int w = q + 1; w < b.length; w++) {
					if (b[q] < b[w]) {
						temp = b[w];
						b[w] = b[q];
						b[q] = temp;
					}
				}
			}
			System.out.println(b[k - 1]);
		}
	}

}