package java_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 ��ƽ����

 ��ƽ���Ͷ����ֳ�Ϊ�������ն���
 ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
 �����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�

 ���磺
 5 = 0^2 + 0^2 + 1^2 + 2^2
 7 = 1^2 + 1^2 + 1^2 + 2^2
 ��^���ű�ʾ�˷�����˼��

 ����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
 Ҫ�����4��������
 0 <= a <= b <= c <= d
 �������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��


 ��������Ϊһ��������N (N<5000000)
 Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�

 ���磬���룺
 5
 �����Ӧ�������
 0 0 1 2

 �����磬���룺
 12
 �����Ӧ�������
 0 2 2 2

 �����磬���룺
 773535
 �����Ӧ�������
 1 1 267 838

 ��ԴԼ����
 ��ֵ�ڴ����ģ���������� < 256M
 CPU����  < 3000ms


 ���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

 ���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
 ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
 ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
 */
public class b_8 {
	static int N;
	static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for (int c = 0; c * c <= N / 2; ++c) {
			for (int d = c; c * c + d * d <= N; ++d) {
				if (cache.get(c * c + d * d) == null)
					cache.put(c * c + d * d, c);
			}
		}
		for (int a = 0; a * a <= N / 4; ++a) {
			for (int b = a; a * a + b * b <= N / 2; ++b) {
				if (cache.get(N - a * a - b * b) != null) {
					int c = cache.get(N - a * a - b * b);
					int d = (int) Math.sqrt(N - a * a - b * b - c * c);
					System.out.printf("%d %d %d %d\n", a, b, c, d);
					return;
				}
			}
		}
	}
}
