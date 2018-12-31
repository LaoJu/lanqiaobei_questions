package basic;

import java.util.Scanner;

public class basic_5 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			nums[i] = in.nextInt();
		}
		int searchNum = in.nextInt();
		int index = getIndex(nums, searchNum);
		System.out.print(index);
	}

	public static int getIndex(int[] nums, int searchNum) {
		int len = nums.length;
		for (int j = 0; j < len; j++) {
			if (nums[j] == searchNum) {
				return j + 1;
			}
		}
		return -1;
	}
}
