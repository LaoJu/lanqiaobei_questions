package java_8;
/*
���⣺��󹫹��Ӵ�

��󹫹��Ӵ�����������ǣ�
���������������Ӵ����ܹ�ƥ���ϵ���󳤶��Ƕ��١�

���磺"abcdkkk" �� "baabcdadabc"��
�����ҵ�����Ĺ����Ӵ���"abcd",������󹫹��Ӵ�����Ϊ4��

����ĳ����ǲ��þ��󷨽������ģ���Դ��Ĺ�ģ�����������ǱȽ���Ч�Ľⷨ��

������ýⷨ��˼·������ȫ���߲���ȱʧ�Ĵ��롣



public class Main
{
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[][] a = new int[c1.length+1][c2.length+1];

		int max = 0;
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = __________________;  //���
					if(a[i][j] > max) max = a[i][j];
				}
			}
		}

		return max;
	}

	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}


ע�⣺ֻ�ύȱ�ٵĴ��룬��Ҫ�ύ���еĴ���ͷ��š�Ҳ��Ҫ�ύ˵�������֡�

*/
public class b_6
{
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int[][] a = new int[c1.length+1][c2.length+1];

		int max = 0;
		//��̬�滮
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = a[i-1][j-1]+1;  //���
					if(a[i][j] > max) max = a[i][j];
				}
			}
		}

		return max;
	}

	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}
