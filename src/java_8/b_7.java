package java_8;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 ���⣺��������

 С����������һ����ʷ���ס���Щ��ʷ�����г����˺ܶ����ڡ�С��֪����Щ���ڶ���1960��1��1����2059��12��31�ա���С��ͷ�۵��ǣ���Щ���ڲ��õĸ�ʽ�ǳ���ͳһ���в�����/��/�յģ��в�����/��/��ģ����в�����/��/��ġ������鷳���ǣ����Ҳ��ʡ����ǰ��λ��ʹ�������ϵ�һ�����ڣ����ںܶ���ܵ����������Ӧ��

 ����02/03/04��������2002��03��04�ա�2004��02��03�ջ�2004��03��02�ա�

 ����һ�������ϵ����ڣ����ܰ���С���ж�����Щ���ܵ����ڶ����Ӧ��

 ����
 ----
 һ�����ڣ���ʽ��"AA/BB/CC"��  (0 <= A, B, C <= 9)

 ����
 ----
 ������ɸ�����ͬ�����ڣ�ÿ������һ�У���ʽ��"yyyy-MM-dd"��������ڰ����絽�����С�

 ��������
 ----
 02/03/04

 �������
 ----
 2002-03-04
 2004-02-03
 2004-03-02

 ��ԴԼ����
 ��ֵ�ڴ����ģ���������� < 256M
 CPU����  < 1000ms


 ���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

 ���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
 ��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
 ��������ֱ����ǣ�Main��������Ч���봦��


 */
public class b_7 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();

		int a = (in.charAt(0) - '0') * 10 + (in.charAt(1) - '0');
		int b = (in.charAt(3) - '0') * 10 + (in.charAt(4) - '0');
		int c = (in.charAt(6) - '0') * 10 + (in.charAt(7) - '0');

		String case1 = f(a, b, c);
		String case2 = f(c, a, b);
	    String case3 = f(c, b, a);
	    
	    /*TreeSet��ȥ�غ�������*/
	    Set<String> ans=new TreeSet<String>();
	    if (case1 != "")ans.add(case1);
	    if (case2 != "")ans.add(case2);
	    if (case3 != "")ans.add(case3);
	    for (String s:ans) {
	      System.out.println(s);
	    }
	    
	}

	static boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	static String f(int a, int b, int c) {
		if (a >= 0 && a <= 59)
			a += 2000;
		else if (a >= 60 && a <= 99)
			a += 1900;
		else
			return "";

		if (b < 1 || b > 12)
			return "";
		if (c < 1 || c > 31)
			return "";

		boolean _isLeap = isLeap(a);
		switch (b) {// ����У��
		case 2:
			if (_isLeap && c > 29)
				return "";
			if (!_isLeap && c > 28)
				return "";
			break;
		case 4:
			if (c > 30)
				return "";
			break;
		case 6:
			if (c > 30)
				return "";
			break;
		case 9:
			if (c > 30)
				return "";
			break;
		case 11:
			if (c > 30)
				return "";
			break;
		default:
			break;
		}
		String _a = a + "", _b = b + "", _c = c + "";

		if (_b.length() == 1)
			_b = "0" + _b;
		if (_c.length() == 1)
			_c = "0" + _c;

		return _a + "-" + _b + "-" + _c;
	}
}
