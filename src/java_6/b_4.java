package java_6;

import java.util.Vector;

/*
ѭ���ڳ���

������������������ʱ�����ѭ��С������ѭ�����ֳ�Ϊ��ѭ���ڡ�
���磬11/13=6=>0.846153846153.....  ��ѭ����Ϊ[846153] ����6λ��
����ķ������������ѭ���ڵĳ��ȡ�

����ϸ�Ķ����룬����д���߲���ȱ�ٵĴ��롣

	public static int f(int n, int m)
	{
		n = n % m;
		Vector v = new Vector();

		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  _________________________________ ;  //���
		}
	}

ע�⣬ֻ����дȱ�ٵĲ��֣���Ҫ�ظ���д���д��롣��Ҫ��д�κζ�������֡�

*/
public class b_4 {
	
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();		
		for(;;)
		{	
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)  
				return v.size()-v.indexOf(n);
		}
	}	
	public static void main(String[] args)
	{
		System.out.println(f(1, 8));
		System.out.println(f(8, 3));
		System.out.println(f(11, 13));
		System.out.println(f(39, 190));
	}
}
