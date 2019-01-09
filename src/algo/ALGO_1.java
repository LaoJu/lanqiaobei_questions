package algo;

import java.util.*;

public class ALGO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		// 第一部分：输入序列的长度及序列
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		// 第二部分：输入查询的个数m,区间范围（l，r）,以及k的值
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			// 第三部分：将l到r这个区间范围的值放入到数组b中
			int[] b = new int[r - l + 1];
			int e = 0;
			for (int j = l - 1; j <= r - 1; j++) {
				b[e++] = a[j];
			}
			// 第四部分：将数组b进行排序,并按要求输出
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