package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class basic_9 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					if (((i + j) * 2 + k) == num) {
						numList.add(i * 10000 + j * 1000 + k * 100 + j * 10 + i);
					}

					if ((i + j + k) * 2 == num) {
						numList.add(i * 100000 + j * 10000 + k * 1000 + k * 100
								+ j * 10 + i);
					}
				}
			}
		}
		Collections.sort(numList);
		for (Integer integer : numList) {
			System.out.println(integer);
		}

	}
}
