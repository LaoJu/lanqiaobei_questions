package java_7;
/*
����ʽ

     B      DEF
A + --- + ------- = 10
     C      GHI

�������ʾ�����⣬���Բμ���ͼ1.jpg����


�����ʽ��A~I����1~9�����֣���ͬ����ĸ����ͬ�����֡�

���磺
6+8/3+952/714 ����һ�ֽⷨ��
5+3/1+972/486 ����һ�ֽⷨ��

�����ʽһ���ж����ֽⷨ��

ע�⣺���ύӦ���Ǹ���������Ҫ��д�κζ�������ݻ�˵�������֡�
*/
public class b_3 {
	static int a[] = {1,2,3,4,5,6,7,8,9};
	static int ans = 0;
	
	public static void main(String args[]){
		f(0);
		System.out.println(ans);
	}
	
	static void f(int k){
		if(k==9){
			if(check()){
				ans ++;
			}
		}
		for(int i=k;i<9;i++){
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			
			f(k+1);
			
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}
	
	static boolean check(){
		int x = a[3]*100+a[4]*10+a[5];
		int y = a[6]*100+a[7]*10+a[8];
		
		if((a[1]*y+a[2]*x)%(a[2]*y)==0 && a[0]+(a[1]*y+a[2]*x)/(a[2]*y) == 10){
			return true;
		}
		else {
			return false;
		}
		
	}
}
