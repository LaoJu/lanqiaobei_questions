package java_6;

import java.util.Scanner;
/*

���ϻ���

    ���������ϳ����ھٰ�һ�δ����Żݻ��������C�����ϣ�ƾ3��ƿ�ǿ����ٻ�һƿC�����ϣ����ҿ���һֱѭ����ȥ�������������ˡ�

    �������һ�£����С�����˷�ƿ�ǣ������زμӻ����ô����������ʼ�����nƿ���ϣ������һ���ܵõ�����ƿ���ϡ�

    ���룺һ������n����ʾ��ʼ���������������0<n<10000��
    �����һ����������ʾʵ�ʵõ���������

    ���磺
    �û����룺
    100
    ����Ӧ�������
    149

    �û����룺
    101
    ����Ӧ�������
    151


    ��ԴԼ����
    ��ֵ�ڴ����ģ���������� < 256M
    CPU����  < 1000ms


    ���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

    ���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
    ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
    ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
*/

public class b_8 {
	static int sum;
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
//		get_num(n);
//		System.out.println(sum+n);
		sum = get_num_2(n);
		System.out.println(sum);
	}
	
	public static void get_num(int n){
		int n_1 = n/3;
		int n_2 = n%3;
		sum+=n_1;
		if((n_1+n_2)>=3){
			get_num(n_1+n_2);
		}else {
			sum+=n_2;
		}
	}
	
	static int get_num_2(int n){
		int ans = 0;
	    while (n >= 3) {
	      n -= 2;
	      ans += 3;
	    }
	    ans += n;
	    return ans;
	}
}
