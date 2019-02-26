package java_4;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 
 标题: 黄金连分数


 黄金分割数0.61803... 是个无理数，这个常数十分重要，在许多工程问题中会出现。有时需要把这个数字求得很精确。

 对于某些精密工程，常数的精度很重要。也许你听说过哈勃太空望远镜，它首次升空后就发现了一处人工加工错误，对那样一个庞然大物，
 其实只是镜面加工时有比头发丝还细许多倍的一处错误而已，却使它成了“近视眼”!!


 言归正传，我们如何求得黄金分割数的尽可能精确的值呢？有许多方法。

 比较简单的一种是用连分数：

                  1
 黄金数 = ---------------------
                      1
           1 + -----------------
                        1
               1 + -------------
                          1
                   1 + ---------
                          1 + ...


 这个连分数计算的“层数”越多，它的值越接近黄金分割数。

 请你利用这一特性，求出黄金分割数的足够精确值，要求四舍五入到小数点后100位。

 小数点后3位的值为：0.618
 小数点后4位的值为：0.6180
 小数点后5位的值为：0.61803
 小数点后7位的值为：0.6180340
 （注意尾部的0，不能忽略）

 你的任务是：写出精确到小数点后100位精度的黄金分割值。

 注意：尾数的四舍五入！ 尾数是0也要保留！

 显然答案是一个小数，其小数点后有100位数字，请通过浏览器直接提交该数字。
 注意：不要提交解答过程，或其它辅助说明类的内容。
 
 
 */
public class b_4 {
	//1.式子化简-->使用斐波那契递推比值
	//2.何为精确，保留100位小数，则需要保证101位之前都是稳定的
	//3.普通数字类型不能保留到100为小数，注意BigInteger类和BigDecimal类的区别
	public static void main(String args[]){
//		double n1 = 1.0;
//		double n2 = 1.0;
//		double num = 0;
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		
		for(int i=1;i<500;i++){
//			num = n2/(n1+n2);
//			System.out.println(num);
//			n1=n2;		
//			n2=n1+n2;	
			
			BigInteger tmp = n1;
			n1=n2;
			n2=tmp.add(n2);
		}
		
		BigDecimal num = new BigDecimal(n1,110).divide(new BigDecimal(n2,110),BigDecimal.ROUND_HALF_DOWN);
		System.out.println(num.toPlainString().substring(0,103));
	}

}
