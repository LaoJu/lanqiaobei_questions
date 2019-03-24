package java_7;
/*
凑算式

     B      DEF
A + --- + ------- = 10
     C      GHI

（如果显示有问题，可以参见【图1.jpg】）


这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
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
