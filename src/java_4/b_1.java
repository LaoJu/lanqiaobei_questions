package java_4;
import java.util.Calendar;
/*
����: ����ĩ������


    ����а�̳�1999��12��31��������ĩ�ա���Ȼ��ҥ���Ѿ��������ơ�

    �����˳ƽ���ĳ������ĩ��12��31�գ����������һ���....

    ��Ȥ���ǣ��κ�һ������ĩ����ݵ�12��31�ն�������������һ!!

    ���ǣ���ҥ�������̡����޸�Ϊ������......

    1999���12��31���������壬���ʣ�δ����һ�������������һ������ĩ�꣨��xx99�꣩��12��31�������������죨�������գ���

    ��ش����ݣ�ֻд���4λ��������Ҫд12��31�ȶ�����Ϣ��

 */
public class b_1 {
	public static void main(String args[]){
		Calendar calendar = Calendar.getInstance();
		for(int year=1999;year<10000;year+=100){
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 11);//ע���·ݼ���0-11
			calendar.set(Calendar.DAY_OF_MONTH, 31);
			
			if(calendar.get(Calendar.DAY_OF_WEEK)==1){//ע��ÿ�ܴ���������1-7
				System.out.println(calendar.get(Calendar.YEAR));
				break;
			}
		}
	} 
	
}
