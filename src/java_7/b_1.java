package java_7;

import java.math.BigInteger;

/*
ú����Ŀ

��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��

�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class b_1 {
	public static void main(String args[]){
		int sum = 1;
		int m=1;//ÿ��ú������
		int i=1;//����
		int n=2;//�ӷ�����
		while(i<100){//ע��ѭ��99�Σ���һ���Ѿ�������sum��ʼֵ(sum=1)��
			sum+=(m+=n);
			n++;
			i++;
		}
		System.out.println(sum);
	}
	
//	  public static void main(String[] args) {
//		    int pre=1;
//		    int plus=2;
//		    long sum=1;
//		    for (int k = 2; k <=100 ; ++k) {
//		      pre=pre+plus;
//		      sum+=pre;
//		      plus++;
//		    }
//		    System.out.println(sum);
//		  }
}
