package java_8;
/*
���⣺ȡ��λ

��1�������ĵ�kλ�����кܶ��ַ�����
���µķ�������һ�֡�

public class Main
{
	static int len(int x){
		if(x<10) return 1;
		return len(x/10)+1;
	}

	// ȡx�ĵ�kλ����
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return ______________________;  //���
	}

	public static void main(String[] args)
	{
		int x = 23513;
		//System.out.println(len(x));
		System.out.println(f(x,3));
	}
}

������Ŀ�еĲ������ݣ�Ӧ�ô�ӡ5��

����ϸ����Դ�룬�����仮�߲�����ȱ�ٵĴ��롣

ע�⣺ֻ�ύȱʧ�Ĵ��룬��Ҫ��д�κ��������ݻ�˵���Ե����֡�
*/
public class b_5
{
	static int len(int x){
		if(x<10) return 1;
		return len(x/10)+1;
	}

	// ȡx�ĵ�kλ����
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return f(x/10,k);  //���
	}

	public static void main(String[] args)
	{
		int x = 23513;
		//System.out.println(len(x));
		System.out.println(f(x,3));
	}
}