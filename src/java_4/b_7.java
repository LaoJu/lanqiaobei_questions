package java_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * 
 ���⣺����Ʊ��

    ĳ���ܵ�λ�·���ĳ��Ʊ�ݣ���Ҫ������ȫ���ջء�

    ÿ��Ʊ����Ψһ��ID�š�ȫ������Ʊ�ݵ�ID���������ģ���ID�Ŀ�ʼ���������ѡ���ġ�

    ��Ϊ������Ա�������¼��ID�ŵ�ʱ������һ�����������ĳ��ID�Ϻţ�����һ��ID�غš�

    ���������ͨ����̣��ҳ��Ϻŵ�ID���غŵ�ID��

    ����ϺŲ����ܷ�����������С�š�

Ҫ�������������һ������N(N<100)��ʾ��������������
���Ŷ���N�����ݡ�
ÿ�����ݳ��Ȳ��ȣ����ÿո�ֿ������ɸ���������100������������������100000��
ÿ����������һ��ID�š�

Ҫ��������1�У�����������m n���ÿո�ָ���
���У�m��ʾ�Ϻ�ID��n��ʾ�غ�ID

���磺
�û����룺
2
5 6 8 11 9
10 12 9

����������
7 9


�����磺
�û����룺
6
164 178 108 109 180 155 141 159 104 182 179 118 137 184 115 124 125 129 168 196
172 189 127 107 112 192 103 131 133 169 158
128 102 110 148 139 157 140 195 197
185 152 135 106 123 173 122 136 174 191 145 116 151 143 175 120 161 134 162 190
149 138 142 146 199 126 165 156 153 193 144 166 170 121 171 132 101 194 187 188
113 130 176 154 177 120 117 150 114 183 186 181 100 163 160 167 147 198 111 119

����������
105 120


��ԴԼ����
��ֵ�ڴ����ģ���������� < 64M
CPU����  < 2000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.6�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦����
 */

//�൱��һ�����������֣�����˳��������ָ�
//��ö�٣�Ҫע����������ķ�����ʽ
public class b_7 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		List<Integer> numlist = new ArrayList<Integer>();
		
		int n = scanner.nextInt();
		scanner.nextLine();//�Ե���������Ļ��з���
		for(int i=0;i<n;i++){
			String[] string = scanner.nextLine().split(" ");
			for(int j=0;j<string.length;j++){
				numlist.add(Integer.valueOf(string[j]));
			}
		}
		
		Collections.sort(numlist);
		
		int less = 0;
		int more = 0;
		
		for(int i=0;i<numlist.size()-2;i++){
			if ((numlist.get(i+1)-numlist.get(i))==2) {
				less = numlist.get(i)+1;
			}
//			if(numlist.get(i+1)==numlist.get(i)){ ȡ������Integer���� ��==�Ƚϻᳬʱ������Ƚ���equals
			if(numlist.get(i+1).equals(numlist.get(i))){//����д���ж��������0
				more=numlist.get(i);
			}
		}
		
		System.out.print(less+" "+more);
	}
}