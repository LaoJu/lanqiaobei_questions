package java_6;
/*
三羊献瑞

观察下面的加法算式：

      祥 瑞 生 辉
  +   三 羊 献 瑞
-------------------
   三 羊 生 瑞 气

(如果有对齐问题，可以参看【图1.jpg】)

其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。

请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。

*/
/*
      a b c d
  +   e f g b
-------------------
    e f c b i

   e=1,a=9,f=0,c=b+1,c+g>10
   */
public class b_3 {
	public static void main(String arsg[]){
		for(int b=2;b<9;b++){
			int c=b+1;
			if(c==9)continue;
			for(int d=2;d<9;d++){
				if(d==9||d==b||d==c)continue;
				for(int g=2;g<9;g++){
				if(g==d||g==b||g==c||c+g<=10)continue;
					int n1 = 9000+b*100+c*10+d;
					int n2 = 1000+g*10+b;
					for(int i=2;i<9;i++){
						if(i==b||i==c||i==d||i==g)continue;
						int sum = 10000+c*100+b*10+i;
						if(n1+n2 == sum){
							System.out.println("n1="+n1);
							System.out.println("n2="+n2);
							System.out.println("sum="+sum);

						}
					}
				}
			}
			
			
		}
	}
}
