package java_5;

/*
 ���⣺����ĸ

 ��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ���

 ������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ��

 �õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��

 ����һ��Сд��ĸ����ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�

 */
public class b_3 {
	public static void main(String args[]) {
		char[] a = new char[2014];
		int index = 0;

		// ��ʼ������
		for (int i = 0; i < 106; i++) {
			for (int j = 0; j < 19; j++) {
				a[index++] = (char) ('a' + j);
			}
		}

		int len = 2014;
		while (len != 1) {
			int k = 0;
			for (int i = 1; i < len; i += 2) {
				a[k++] = a[i];
			}
			len = k;
		}

		System.out.println(a[0]);
	}

}
