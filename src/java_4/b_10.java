package java_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 ���⣺����������

    С����Щ��һֱ��˼������һ����ֶ���Ȥ�����⣺

    ��1~N��ĳ��ȫ�������ж��ٸ����������أ�������˵����������Ķ����ǣ�

    �������[L, R] �������Ԫ�أ��������еĵ�L������R��Ԫ�أ�����������ܵõ�һ������ΪR-L+1�ġ����������У������������������䡣

    ��N��С��ʱ��С�����Ժܿ������𰸣����ǵ�N����ʱ������Ͳ�����ô���ˣ�����С����Ҫ��İ�����

�����ʽ��
��һ����һ��������N (1 <= N <= 50000), ��ʾȫ���еĹ�ģ��
�ڶ�����N����ͬ������Pi(1 <= Pi <= N)�� ��ʾ��N�����ֵ�ĳһȫ���С�

�����ʽ��
���һ����������ʾ��ͬ�����������Ŀ��

ʾ����
�û����룺
4
3 2 4 1

����Ӧ�����
7

�û����룺
5
3 4 2 5 1

����Ӧ�����
9

���ͣ�
��һ�������У���7����������ֱ��ǣ�[1,1], [1,2], [1,3], [1,4], [2,2], [3,3], [4,4]
�ڶ��������У���9����������ֱ��ǣ�[1,1], [1,2], [1,3], [1,4], [1,5], [2,2], [3,3], [4,4], [5,5]


��ԴԼ����
��ֵ�ڴ����ģ���������� < 64M
CPU����  < 5000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.6�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
 */
public class b_10 {
	
	static int sum =0;
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for (int j=i;j<n;j++){
				if(i==j){
					sum++;
//					System.out.println(a[i]+" "+a[j]);
				}else {
					if(check(a,i,j)){
						sum++;
//						System.out.println(a[i]+" "+a[j]);
					}
				}		
			}
		}
		
		System.out.println(sum);
	}
	
	static boolean check(int a[],int i,int j){
		List<Integer> numList = new ArrayList<Integer>();
		for(int k=i;k<=j;k++){
			numList.add(a[k]);
		}
		Collections.sort(numList);
		int flag=1;
		int m = 0;
		for(m=0;m<numList.size()-1;m++){
			if(numList.get(m+1)-numList.get(m) != 1){
				flag = 0;
			}
		}
		if(flag==1){
			return true;
		}else {
			return false;
		}
	}

}
