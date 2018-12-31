package basic;

public class basic_2 {

	public static void main(String args[]) {
		for (int i = 0; i < 32; i++) {
			String binary = Integer.toBinaryString(i);
			String string = String.format("%05d", Integer.parseInt(binary));
			System.out.println(string);
		}
	}
}
