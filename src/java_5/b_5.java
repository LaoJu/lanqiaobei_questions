package java_5;

/*
 ���⣺Բ����

    ��ѧ��չ��ʷ�ϣ�Բ���ʵļ�������������Ȥ�����Ǵ���Ĺ��¡��������෽�����漰�������

    ͼ1.png����ʾ������һ��������������ʽ��ʾ��Բ�����󷨡�

    ����ĳ���ʵ���˸���ⷽ����ʵ�������е�������x�ĳ�ʼֵ �������С�

    �����ӡ��Բ���ʽ���ֵ������С�����4λ������һ����Բ������ֵ�Ǻϣ���

	double x = 111;
	for(int n = 10000; n>=0; n--){
		int i = 2 * n + 1;
		x = 2 + (i*i / x);
	}

	System.out.println(String.format("%.4f", ______________));
 */
public class b_5 {
	public static void main(String args[]) {
		double x = 111;
		for (int n = 10000; n >= 0; n--) {
			int i = 2 * n + 1;
			x = 2 + (i * i / x);
		}
		System.out.println(String.format("%.4f",4/(x-1)));
	}
}