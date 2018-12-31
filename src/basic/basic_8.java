package basic;

public class basic_8 {
	public static void main(String args[]) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				int num = i * 1000 + j * 100 + j * 10 + i;
				System.out.println(num);
			}
		}
	}
}
