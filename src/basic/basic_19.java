package basic;

import java.util.Scanner;

public class basic_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String string = scanner.next();
		char[] s = string.toCharArray();

		int k = n - 1, flag, ans;
		// ans��¼��������
		ans = flag = 0;

		for (int i = 0; i < k; i++) {
			for (int j = k; j >= i; j--) {
				if (j == i) {
					// nΪż�������������γ��ֵ���ĸ
					// nΪ���������г���һ�������γ��ֵ���ĸ
					if (n % 2 == 0 || flag == 1) {
						System.out.println("Impossible");
						return;
					}
					flag = 1;
					ans = ans + n / 2 - i;
				} else if (s[i] == s[j]) {// �ҵ��Գ�λ�ã���ʼ�ƶ�
					for (int o = j; o < k; o++) {
						char temp = s[o];
						s[o] = s[o + 1];
						s[o + 1] = temp;
						ans++;
					}
					k--;
					break;
				}
			}
		}
		System.out.println(ans);

	}

}
