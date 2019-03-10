package java_5;
import java.util.Scanner;

/*
���⣺�ع�ȡ��

    X ������һ���ع����⡣�� n x m �����ӵľ���ÿ�����ӷ�һ��������ÿ���������ż�ֵ��ǩ��

    �ع�����������Ͻǣ����������½ǡ�

    С���������ع�����ڣ�����Ҫ����ֻ�����һ��������ߡ�

    �߹�ĳ������ʱ������Ǹ������еı�����ֵ��С���������ⱦ����ֵ����С���Ϳ�������������Ȼ��Ҳ���Բ��ã���

    ��С���ߵ�����ʱ����������еı���ǡ����k��������Щ�����Ϳ����͸�С����

    �����С����һ�㣬�ڸ����ľ����£����ж����ֲ�ͬ���ж������ܻ����k��������

�����ݸ�ʽ��

    ����һ��3���������ÿո�ֿ���n m k (1<=n,m<=50, 1<=k<=12)

    �������� n �����ݣ�ÿ���� m ������ Ci (0<=Ci<=12)������������ϵı���ļ�ֵ

    Ҫ�����һ����������ʾ����ȡk���������ж��������������ֿ��ܴܺ�������� 1000000007 ȡģ�Ľ����

���磬���룺
2 2 2
1 2
2 1
����Ӧ�������
2

�����磬���룺
2 3 2
1 2 3
2 1 5
����Ӧ�������
14

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 2000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
*/
public class b_9 {
  private static final int MOD = 1000000007;
  static int[][] data;
  private static int n;
  private static int m;
  private static int k;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    k = sc.nextInt();
    data = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        data[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 51; i++) {
      for (int j = 0; j < 51; j++) {
        for (int l = 0; l < 14; l++) {
          for (int o = 0; o < 14; o++) {
            cache[i][j][l][o] = -1;
          }
        }
      }
    }
    long ans = dfs(0, 0, -1, 0);
    System.out.println(ans);
  }

  static long[][][][] cache = new long[51][51][14][14];

  private static long dfs(int x, int y, int max, int cnt) {
    if (cache[x][y][max + 1][cnt] != -1) return cache[x][y][max + 1][cnt];
    if (x == n || y == m || cnt > k) return 0;
    int cur = data[x][y];
    int ans = 0;
    if (x == n - 1 && y == m - 1) {
      if (cnt == k || (cnt == k - 1 && cur > max)) return 1;
      return ans;
    }

    if (cur > max) {
      ans += dfs(x, y + 1, cur, cnt + 1);
      ans += dfs(x + 1, y, cur, cnt + 1);
    }
    ans += dfs(x, y + 1, max, cnt);
    ans += dfs(x + 1, y, max, cnt);
    cache[x][y][max + 1][cnt] = ans % MOD;
    return ans;
  }
}
