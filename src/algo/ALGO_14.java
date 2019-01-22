package algo;

import java.util.Scanner;

public class ALGO_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();// 2<=N<=10或N=16
		String M = input.next();// M（其中16进制数字为0-9与A-F)
		Long a = Long.valueOf(M, N);// 转long型
		// System.out.println("a="+a);
		kuye(a, 0, N);
	}

	public static void kuye(long a, int k, int N) {
		long temp = a;
		long a1 = a % N;
		a = a / N;
		while (a != 0) {
			a1 = a1 * N + a % N;
			a = a / N;
		}
		if (k > 30) {
			System.out.println("Impossible!");
		} else if (a1 == temp) {
			System.out.println("STEP=" + k);
		} else {
			temp = temp + a1;
			kuye(temp, k + 1, N);
		}
	}
}