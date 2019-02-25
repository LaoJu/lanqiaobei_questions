package java_6;

import java.util.Scanner;

public class b_8 {
	static int sum;
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		get_num(n);
		System.out.println(sum+n);
	}
	
	public static void get_num(int n){
		int n_1 = n/3;
		int n_2 = n%3;
		sum+=n_1;
		if((n_1+n_2)>=3){
			get_num(n_1+n_2);
		}else {
			sum+=n_2;
		}
	}
}
