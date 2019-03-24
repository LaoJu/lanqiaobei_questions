package java_8;

import java.util.Scanner;

/*
 ���⣺ k������

 ����һ������ΪN�����У�A1, A2, ... AN���������һ��������������Ai, Ai+1, ... Aj(i <= j)֮����K�ı��������Ǿͳ��������[i, j]��K�����䡣

 ��������������ܹ��ж��ٸ�K��������

 ����
 -----
 ��һ�а�����������N��K��(1 <= N, K <= 100000)
 ����N��ÿ�а���һ������Ai��(1 <= Ai <= 100000)

 ���
 -----
 ���һ������������K���������Ŀ��


 ���磬
 ���룺
 5 2
 1
 2
 3
 4
 5

 ����Ӧ�������
 6

 ��ԴԼ����
 ��ֵ�ڴ����ģ���������� < 256M
 CPU����  < 2000ms


 ���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

 ���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
 ��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
 ��������ֱ����ǣ�Main��������Ч���봦��
 */
public class b_10 {
	static int ans = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int a[] = new int[N + 1];
		long S[] = new long[N + 1];
		S[0] = 0;
		for (int i = 1; i <=N; i++) {
			a[i] = scanner.nextInt();
			S[i] = S[i - 1] + a[i];

		}

		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if ((S[j] - S[i - 1]) % K == 0) {
					ans++;
				}
			}
		}

		System.out.println(ans);

	}
}
