package java_5;

import java.awt.Checkbox;
import java.util.HashSet;
import java.util.Set;

/*
 ���⣺�˿�����

    A A 2 2 3 3 4 4�� һ��4���˿��ơ�����������ų�һ�С�
    Ҫ������A�м���1���ƣ�����2֮����2���ƣ�����3֮����3���ƣ�����4֮����4���ơ�

    ����д�����з���Ҫ��������У��ֵ�����С���Ǹ���

���磺22AA3344 �� A2A23344 �ֵ���С����Ȼ�����Ƕ���������Ҫ��Ĵ𰸡�


��ͨ��������ύ�𰸡���A��һ����Ҫ��Сд��ĸa��Ҳ��Ҫ�á�1�����档�ַ���һ����Ҫ���ո�
 */
public class b_7 {
	public static void main(String args[]){
		char[] a = {'A', 'A', '2', '2', '3', '3', '4', '4'};
		f(a,0);
		for (String s : set) {
			System.out.println(s);
		}
		
	}
	static Set<String> set = new HashSet<String>();
	static void f(char[] a,int k){
		if(k==a.length){
			String s = new String(a);
			if(check(s)){
				set.add(s);
			}
		}
		for(int i=k;i<a.length;i++){
			char t = a[k];
			a[k] = a[i];
			a[i] = t;
			
			f(a, k+1);
			
			t = a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
	
	static boolean check(String s){
		if (s.lastIndexOf('A') - s.indexOf('A') == 2 &&
		        s.lastIndexOf('2') - s.indexOf('2') == 3 &&
		        s.lastIndexOf('3') - s.indexOf('3') == 4 &&
		        s.lastIndexOf('4') - s.indexOf('4') == 5)
		      return true;
		    return false;
	}
}
