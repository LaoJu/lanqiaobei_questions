package java_7;

import java.util.Arrays;
import java.util.Scanner;

/*
 ȡ����

 ��������ȡ�����Ϸ��
 һ����N����ÿ������ȡ��ÿ�ο�ȡ����{n1,n2,n3}�е��κ�һ����Ŀ��
 ����޷�����ȡ������Ϸ������
 ��ʱ���������������һ����ʤ��
 ������˶�����������Ϊƽ�֡�

 ����˫���������������ȡ����
 ��һ��ȡ�����һ����Ӯ��
 �Ա�̽��������⡣

 �����ʽ��
 ��һ��3��������n1 n2 n3���ո�ֿ�����ʾÿ�ο�ȡ����Ŀ (0<n1,n2,n3<100)
 �ڶ���5��������x1 x2 ... x5���ո�ֿ�����ʾ5�ֵĳ�ʼ����(0<xi<1000)

 �����ʽ��
 һ��5���ַ����ո�ֿ����ֱ��ʾÿ����ȡ������ܷ��ʤ��
 �ܻ�ʤ�����+��
 ��֮�����а취��ƽ���֣����0��
 ������ζ����䣬�����-

 ���磬���룺
 1 2 3
 1 2 3 4 5

 ����Ӧ�������
 + 0 + 0 -

 �����磬���룺
 1 4 5
 10 11 12 13 15

 ����Ӧ�������
 0 - 0 + +

 �����磬���룺
 2 3 5
 7 8 9 10 11

 ����Ӧ�������
 + 0 0 0 0


 ��ԴԼ����
 ��ֵ�ڴ����ģ���������� < 256M
 CPU����  < 3000ms


 ���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

 ���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
 ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
 ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
 */

/*
 1 7 8
 900 901 903 905 907
 0 + - - + */
public class b_9 {
	static int n[] = new int[3];

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			n[i] = scanner.nextInt();
		}
		Arrays.sort(n);//����
		
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			char res = f(num, 0, 0);
			System.out.print(res + " ");
		}
		System.out.println();
	}

	// ע��ȡ��󻥻����
	

	static char f(int num, int me, int you) {
		//�����ж�
		if(num<n[0]){
			if ((me&1)==1&&(you&1)==0)return '+';
		      else if ((me&1)==0&&(you&1)==1)return '-';
		      else return '0';
		}
		boolean ping = false;
		for (int i = 0; i < 3; i++) {
			if (num >= n[i]) {
				char res = f(num - n[i], you, me + n[i]);
				if (res == '-') {// ������
					return '+';
				}
				if (res == '0') {
					ping = true;
				}
			}

		}

		// ���û�ж���������
		if (ping) {
			return '0';
		} else {
			return '-';
		}
	}
}
