package java_5;

import java.awt.Checkbox;
import java.util.Scanner;

/*
 ���⣺���ǹ�

    ��n��С����Χ����һȦ����ʦ��ÿ��С���������ż�����ǹ���Ȼ������������Ϸ��

    ÿ��С���Ѷ����Լ����ǹ���һ������ֱߵĺ��ӡ�

    һ�ַ��Ǻ�ӵ���������ǵĺ�������ʦ����1���ǹ����Ӷ����ż����

    �������������Ϸ��ֱ������С���ѵ��ǹ�������ͬΪֹ��

    ���������Ԥ������֪�ĳ�ʼ�ǹ������£���ʦһ����Ҫ�������ٸ��ǹ���

����ʽҪ��

    �������ȶ���һ������N(2<N<100)����ʾС���ѵ�������
    ������һ���ÿո�ֿ���N��ż����ÿ��ż��������1000����С��2��
    Ҫ��������һ����������ʾ��ʦ��Ҫ�������ǹ�����

���磺����
3
2 2 4
����Ӧ�������
4

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
 */
public class b_8 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
		}
		
		int sum = 0;
		while(true){
			for(int i = 0;i<=n-2;++i){
				a[i] -= a[i]/2;
				a[i] += a[i+1]/2;
			}
			a[n-1] -= a[n-1]/2;
			a[n-1] += a[0] /2;
			
			for(int j=0;j<n;j++){
				if(a[j]%2 == 1){
					a[j]++;
					sum++;
				}
			}
			
			if(check(a,n)){
				System.out.println(sum);
				return;
			}
		}
	}
	
	static boolean check(int[] a,int n){
		int t = a[0];
		for(int i=1;i<n;i++){
			if(a[i]!=t){
				return false;
			}
		}
		return true;
	}
}
