package java_6;
/*
��������

�۲�����ļӷ���ʽ��

      �� �� �� ��
  +   �� �� �� ��
-------------------
   �� �� �� �� ��

(����ж������⣬���Բο���ͼ1.jpg��)

���У���ͬ�ĺ��ִ�����ͬ�����֣���ͬ�ĺ��ִ���ͬ�����֡�

������д�����������������4λ���֣���Ψһ������Ҫ��д�κζ������ݡ�

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
