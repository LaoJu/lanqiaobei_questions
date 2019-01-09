package algo;

import java.util.Scanner;

/**
 * ��N��ǰѰ������3������
 * 1.��NΪ������N��N-1��N-2 
 * 2.��NΪż�����ܱ�3������N-1��N-2��N-3
 * 3.��NΪż�������ܱ�3������N��N-1��N-3
 */
public class ALGO_2 {
	static long max = 0;

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		getResult(n);
		System.out.println(max);
	}

	public static void getResult(long n) {
		if (n <= 2) {
			max = n;
		} else if (n % 2 == 1) {
			max = n * (n - 1) * (n - 2);
		} else {
			if (n % 3 == 0) {
				max = (n - 1) * (n - 2) * (n - 3);
			} else {
				max = n * (n - 1) * (n - 3);
			}
		}
	}
}
