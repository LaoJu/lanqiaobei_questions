package java_4;

/*
 
 ���⣺��������

    ���������ǿ��Ա�ʾΪ���������ı�ֵ�����֡�һ������£������ý��Ƶ�С����ʾ������Щʱ�򣬲����������������������������ʾһ����������

    ��ʱ�����ǿ��Խ���һ�����������ࡱ������Ĵ������ʵ�������Ŀ�ꡣΪ�˼�������ֻ�ṩ�˼ӷ��ͳ˷����㡣

class Rational
{
	private long ra;
	private long rb;

	private long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public Rational(long a, long b){
		ra = a;
		rb = b;
		long k = gcd(ra,rb);
		if(k>1){ //��ҪԼ��
			ra /= k;
			rb /= k;
		}
	}
	// �ӷ�
	public Rational add(Rational x){
		return ________________________________________;  //���λ��
	}
	// �˷�
	public Rational mul(Rational x){
		return new Rational(ra*x.ra, rb*x.rb);
	}
	public String toString(){
		if(rb==1) return "" + ra;
		return ra + "/" + rb;
	}
}

ʹ�ø����ʾ����
	Rational a = new Rational(1,3);
	Rational b = new Rational(1,6);
	Rational c = a.add(b);
	System.out.println(a + "+" + b + "=" + c);


����������߼������Ʋ⻮�ߴ��Ĵ��룬ͨ����ҳ�ύ
ע�⣺����ȱ�ٵĴ�����Ϊ�𰸣�ǧ��Ҫ��д����Ĵ��롢���Ż�˵�����֣���
 */
public class b_5 {
	private long ra;
	private long rb;

	public static void main(String args[]){
		b_5 a = new b_5(2,3);
		b_5 b = new b_5(5,6);
		b_5 c = a.add(b);
		System.out.println(a + "+" + b + "=" + c);
	}
	
	private long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public b_5(long a, long b){
		ra = a;
		rb = b;
		long k = gcd(ra,rb);
		if(k>1){ //��ҪԼ��
			ra /= k;
			rb /= k;
		}
	}
	// �ӷ�
	public b_5 add(b_5 x){
		return new b_5(ra*x.rb+x.ra*rb, rb*x.rb);  //���λ��
	}
	// �˷�
	public b_5 mul(b_5 x){
		return new b_5(ra*x.ra, rb*x.rb);
	}
	
	public String toString(){
		if(rb==1) return "" + ra;
		return ra + "/" + rb;
	}
	
	
}
