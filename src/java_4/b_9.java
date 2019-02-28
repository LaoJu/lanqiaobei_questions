package java_4;

import java.awt.Checkbox;
import java.util.Scanner;

/*
 
 标题：带分数

    100 可以表示为带分数的形式：100 = 3 + 69258 / 714

    还可以表示为：100 = 82 + 3546 / 197

    注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。

    类似这样的带分数，100 有 11 种表示法。

题目要求：
从标准输入读入一个正整数N (N<1000*1000)
程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
注意：不要求输出每个表示，只统计有多少表示法！


例如：
用户输入：
100
程序输出：
11

再例如：
用户输入：
105
程序输出：
6


资源约定：
峰值内存消耗（含虚拟机） < 64M
CPU消耗  < 3000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.6及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

 */

//1.1-9的全排列，递归实现
//2.简单枚举进行判断
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
	
	//递归求arr的全排列
	//k表示确定第k位
	//此处共9个不同数字，k从0-8
	static void f(int arr[],int k){
		if(k==9){
			check(arr);
		}
		for(int i=k;i<arr.length;i++){
			int temp = arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		
			f(arr, k+1);
			
			//递归中的横向移动
		    temp = arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		
	}
	
	//判断一种全排列是否满足要求
	static void check(int arr[]){
		//i为+号前数字个数 最多前面7个数
		for(int i=1;i<=7;i++){
			int n1 = getInt(arr,0,i);
			if(n1>=N)continue;
			
			//j为/前面数字个数 最多8-i个
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
		//s数组开始下标
		//len 长度
		int t=1;
		int ans=0;
		for(int i=s+len-1;i>=s;i--){
			ans+=arr[i]*t;
			t*=10;
		}
		return ans;
	}
}
