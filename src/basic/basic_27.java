package basic;

import java.util.Scanner;

public class basic_27 {
	
	static int n, count = 0; // n��ʾ���̵Ĵ�С��countΪ�������� ��¼���÷����ĸ���
	static int map[][]; // ��ά�����ʾ����

	public static void main(String args[]) {

		Scanner cn = new Scanner(System.in);
		n = cn.nextInt(); // ��ر�����¼��
		map = new int[n][n];
		for (int i = 0; i < n; i++)
			// ���̾���ֵ��¼�루0��1��
			for (int j = 0; j < n; j++)
				map[i][j] = cn.nextInt();
		Put(0, 2); // �ӵ�һ�п�ʼ���а׻ʺ�ķ��ã�2����ף�3�����
		System.out.println(count); // �����еķ�����Ѱ����ɺ�����ҵ��ķ�������
	}

	public static void Put(int t, int s) // ���ûʺ�ĺ���
	{
		if (t == n) // ���е�ǰ���ͻʺ�ķ��������Ƿ�ﵽҪ�󣬼��Ƿ������̵����һ��
		{
			if (s == 2)
				Put(0, 3); // ����׻ʺ���óɹ�������кڻʺ�ķ���
			else
				count++; // ���÷����ҵ���һ�֣�������������ֵ��һ
			return; // ��ǰ������ù��̽��������г���Ļ���
		}
		for (int i = 0; i < n; i++) // ��ÿһ�е�ֵ������в���
		{
			if (map[t][i] != 1)
				continue; // ��ǰλ���Ƿ�Ϊ1���ж�
			if (Check(t, i, s)) {
				map[t][i] = s;
			} // �Ƿ�������ĿҪ���жϣ����㸳ֵ
			else
				continue; // �����㣬ͬһ�е���һ��λ��
			Put(t + 1, s); // ��һ�лʺ�ķ���
			map[t][i] = 1; // ���ݷ��Ĺؼ�
		}
		return; // ������Ӧ�Ļ���
	}

	public static boolean Check(int t, int i, int s) // ������ĿҪ����жϺ���
	{
		for (int q = t - 1; q >= 0; q--) // ��ǰλ���Ϸ��Ƿ��������ͬ�ʺ�ķ��� �������µĻ�û�Ų����
		{
			if (map[q][i] == s)
				return false;
		}
		for (int q = t - 1, w = i - 1; q >= 0 && w >= 0; q--, w--) // �����Խ���
																	// �������µĻ�û�Ų����
		{
			if (map[q][w] == s)
				return false;
		}
		for (int q = t - 1, w = i + 1; q >= 0 && w <= n - 1; q--, w++) // ����ҶԽ���
																		// �������µĻ�û�Ų����
		{
			if (map[q][w] == s)
				return false;
		}
		return true; // ����������£�����Խ��е�ǰ�ʺ�ķ���
	}
}
