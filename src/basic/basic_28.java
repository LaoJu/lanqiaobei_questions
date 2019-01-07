package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class basic_28 {

	static int sum = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}

		getHuffman(a);
		System.out.println(sum);

	}

	public static void getHuffman(List<Integer> a) {
		int len = a.size();
		if (len == 1) {
			return;
		}

		Collections.sort(a);// list升序排列
		int temp = a.get(0) + a.get(1);// 最小两个值相加存在temp中
		sum += temp;
		a.remove(0);
		a.remove(0);
		a.add(temp);

		getHuffman(a);
	}
}
