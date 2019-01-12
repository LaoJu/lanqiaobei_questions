package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
//Kruskal最小生成树
 
class Cow implements Comparable<Cow> {
 
	int u;
	int v;
	int w;
 
	public Cow(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
 
	// 为了更快，自定义排序方法
	public int compareTo(Cow o) {
		return w > o.w ? 1 : -1;
	}
}
 
public class ALGO_6 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		String[] order = br.readLine().split(" ");
		int n = Integer.parseInt(order[0]);
		int p = Integer.parseInt(order[1]);
 
		int[] anweitime = new int[n];
		int mintime = Integer.MAX_VALUE;// 记录出需要安慰最少时间的奶牛的安慰时间
		for (int i = 0; i < anweitime.length; i++) {
			int time = Integer.parseInt(br.readLine());
			if (time < mintime)
				mintime = time;
			anweitime[i] = time;
		}
 
		// 一个存放顶点的集合
		ArrayList<Cow> list = new ArrayList<Cow>();
		for (int i = 0; i < p; i++) {
			String data[] = br.readLine().split(" ");
			int u = Integer.parseInt(data[0]);
			int v = Integer.parseInt(data[1]);
			int w = Integer.parseInt(data[2]);
			list.add(new Cow(u, v, w * 2 + anweitime[u - 1] + anweitime[v - 1]));
		}
 
		Collections.sort(list);
 
		int alltime = 0;
		// 在这实现克鲁斯卡尔算法，求最小生成树
		int[] lowcost = new int[n + 1];
		for (int i = 0; i < p; i++) {
 
			int a = find(lowcost, list.get(i).u);
			int b = find(lowcost, list.get(i).v);
 
			if (a < b) {
				lowcost[b] = a;
				alltime += list.get(i).w;
			} else if (a > b) {
				lowcost[a] = b;
				alltime += list.get(i).w;
			}
		}
		System.out.println(alltime + mintime);
	}
 
	// 通过lowcost数组和这个find的方法，来检查是否行程环路
	public static int find(int[] lowcost, int k) {
 
		while (lowcost[k] > 0) {
			k = lowcost[k];
		}
		return k;
	}

}