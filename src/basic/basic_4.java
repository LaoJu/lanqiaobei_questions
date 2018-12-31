package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic_4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			numList.add(in.nextInt());
		}
		getMaxMinSum(numList, num);
	}

	public static void getMaxMinSum(List<Integer> list, int n) {
		int max = list.get(0);
		int min = list.get(0);
		double sum = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = list.get(i);
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
			sum += temp;
		}
		System.out.println(max);
		System.out.println(min);
		// System.out.println(sum);
		String s = String.valueOf(sum);
		String[] ss = s.split("[.]");
		System.out.println(ss[0]);
	}
}
