package java_4;
/*
 
 
 ���⣺��������

    һ������������ྭ���㷨�����������ϣ������ȡ�

    ��ʵ��Ӧ��ʱ���������������һЩ�����Ҫ������û��Ҫ������Щ�����㷨�����Ը���ʵ������������õĽⷨ��

    ���磬��һ�����������е����ֽ��з�������

    ʹ�ø���������ˣ����������Ҷˣ�0���в���ע��������ص��ǣ�������������������ڲ���Ҫ�����򡣿�����������ص�ͨ��1������ɨ��ͽ���ս��!!

    ���µĳ���ʵ���˸�Ŀ�ꡣ

	static void sort(int[] x)
	{
		int p = 0;
		int left = 0;
		int right = x.length-1;

		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;
			}
			else{
				_________________________;  //�������λ��
			}
		}
	}

   ����������飺
   25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0
   �������Ϊ��
   -3,-2,-16,-5,0,0,0,21,19,33,25,16,18,25



����������߼������Ʋ⻮�ߴ��Ĵ��룬ͨ����ҳ�ύ
ע�⣺����ȱ�ٵĴ�����Ϊ�𰸣�ǧ��Ҫ��д����Ĵ��롢���Ż�˵�����֣���
 */
public class b_6 {
	
	public static void main(String args[]){
		int[] a = {25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	static void sort(int[] x)
	{
		int p = 0;
		int left = 0;
		int right = x.length-1;

		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;
			}
			else{
				p++;  //�������λ��
			}
		}
	}
}