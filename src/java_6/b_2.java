package java_6;

/*
 ����������

 �۲����������,ĳ�����ֵ���������λ�ۼ���Ȼ��������
 1^3 = 1
 8^3  = 512    5+1+2=8
 17^3 = 4913   4+9+1+3=17
 ...

 ����������1,8,17���ڣ�����������ʵ�������һ���ж��ٸ���

 ����д�����֣���Ҫ��д�κζ�������ݻ�˵���Ե����֡�
 */
public class b_2 {
	static int sum = 0;

	public static void main(String args[]) {
		for (int i = 1; i < 100; i++) {
			int ans = i * i * i;
			if (check(ans) == i) {
				System.out.println(i);
				sum++;

			}

		}
		System.out.println(sum);
	}

	static int check(int ans) {
		int all = 0;
		String s = String.valueOf(ans);
		for (int i = 0; i < s.length(); i++) {
			// ע����ȡ�������ַ�
			all += s.charAt(i) - '0';
		}
		return all;
	}
}
