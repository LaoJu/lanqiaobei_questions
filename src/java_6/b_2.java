package java_6;

/*
 立方变自身

 观察下面的现象,某个数字的立方，按位累加仍然等于自身。
 1^3 = 1
 8^3  = 512    5+1+2=8
 17^3 = 4913   4+9+1+3=17
 ...

 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？

 请填写该数字，不要填写任何多余的内容或说明性的文字。
 */
public class b_2 {
	static int sum = 0;

	public static void main(String args[]) {
		for (int i = 1; i < 100; i++) {
			int ans = i * i * i;
			if (check(ans) == i) {
				System.out.println(i);
				sum++;

			}

		}
		System.out.println(sum);
	}

	static int check(int ans) {
		int all = 0;
		String s = String.valueOf(ans);
		for (int i = 0; i < s.length(); i++) {
			// 注意提取出的是字符
			all += s.charAt(i) - '0';
		}
		return all;
	}
}
