package java_7;
/*
��������

ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

��������������һ����Ϩ��236������

���ʣ����Ӷ����꿪ʼ������party�ģ�

����д����ʼ������party����������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�


*/
public class b_2 {
	public static void main(String args[]){
		for(int i=1;i<100;i++){
			for(int j=i;j<100;j++){
				if(((i+j)*(j-i+1)/2)==236){
					System.out.println("i="+i);
					System.out.println("j="+j);
				}
			}
		}
	}
}
