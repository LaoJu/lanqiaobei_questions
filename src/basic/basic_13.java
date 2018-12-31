package basic;
import java.util.Scanner;

public class basic_13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}

		int temp = 0;

		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
