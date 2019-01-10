package algo;

import java.util.Scanner;

/**
 * 动态规划 
 * num[i][j]为第i位为j的数的个数 1<=i<L 0<=j<=K
 * num[i][j] += (num[i-1][x]) 
 * 其中num[i-1][x]可能有多个，x为|x-j| != 1 的数
 * 
 * eg: L=3 K=4 
 *   0 1 2 3 
 * 1 0 1 1 1
 * 2 2 1 0 1
 * 3 1 1 2 3
 * 
 * 
 */
public class ALGO_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int L = scanner.nextInt();
		scanner.close();
		
		int[][] dp = new int[500][500];
		for(int i=0;i<K;i++){
			dp[0][i] = 1;
		}
		dp[0][0] = 0;
		
		for(int i=1;i<L;i++){
			for(int j=0;j<K;j++){
				for(int x=0;x<=K;x++){
					if(Math.abs(x-j)!=1){
						dp[i][j] += dp[i-1][x];
						dp[i][j] %= 1000000007;
					}
				}
			}
		}
		
		long sum = 0;
		for(int i=0;i<K;i++){
			sum += dp[L-1][i];
		}
		
		sum %= 1000000007;
		System.out.println(sum);
	}
}
