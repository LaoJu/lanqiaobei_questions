package java_4;

import java.awt.Checkbox;
import java.util.Scanner;

/*
 
 ���⣺������

    100 ���Ա�ʾΪ����������ʽ��100 = 3 + 69258 / 714

    �����Ա�ʾΪ��100 = 82 + 3546 / 197

    ע���������������У�����1~9�ֱ������ֻ����һ�Σ�������0����

    ���������Ĵ�������100 �� 11 �ֱ�ʾ����

��ĿҪ��
�ӱ�׼�������һ��������N (N<1000*1000)
�������������������1~9���ظ�����©����ɴ�������ʾ��ȫ��������
ע�⣺��Ҫ�����ÿ����ʾ��ֻͳ���ж��ٱ�ʾ����


���磺
�û����룺
100
���������
11

�����磺
�û����룺
105
���������
6


��ԴԼ����
��ֵ�ڴ����ģ���������� < 64M
CPU����  < 3000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.6�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��

 */

//1.1-9��ȫ���У��ݹ�ʵ��
//2.��ö�ٽ����ж�
public class b_9 {
	static int N;
	static int sum=0;
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		f(arr,0);
		System.out.println(sum);
	}
	
	//�ݹ���arr��ȫ����
	//k��ʾȷ����kλ
	//�˴���9����ͬ���֣�k��0-8
	static void f(int arr[],int k){
		if(k==9){
			check(arr);
		}
		for(int i=k;i<arr.length;i++){
			int temp = arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		
			f(arr, k+1);
			
			//�ݹ��еĺ����ƶ�
		    temp = arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		
	}
	
	//�ж�һ��ȫ�����Ƿ�����Ҫ��
	static void check(int arr[]){
		//iΪ+��ǰ���ָ��� ���ǰ��7����
		for(int i=1;i<=7;i++){
			int n1 = getInt(arr,0,i);
			if(n1>=N)continue;
			
			//jΪ/ǰ�����ָ��� ���8-i��
			for(int j=1;j<=8-i;j++){
				int n2 = getInt(arr, i, j);
				int n3 = getInt(arr, i+j, 9-i-j);
				if(n2%n3 == 0 && n1+n2/n3 == N){
					sum++;
				}
			}
		}
		
	}
	
	static int getInt(int arr[],int s,int len){
		//s���鿪ʼ�±�
		//len ����
		int t=1;
		int ans=0;
		for(int i=s+len-1;i>=s;i--){
			ans+=arr[i]*t;
			t*=10;
		}
		return ans;
	}
}
