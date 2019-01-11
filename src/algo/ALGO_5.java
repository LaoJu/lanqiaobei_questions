package algo;

import java.util.Scanner;
import java.util.*;

/**
 * 边权可能为负，dijkstra贪心思想，在此不能使用
 * 
 * SPFA算法--动态逼近
 * 1.设立一个先进先出队列保存待优化的节点
 * 2.优化时取队首u，用u当前的最短路径估计值对u到其他点v进行松弛操作
 * 3.若v的最短路有调整且v不在待优化队列，加入v至队尾
 * 4.持续上述操作直到队列为空
 * （如果某个点进入队列的次数超过N次则存在负环（SPFA无法处理带负环的图）
 * 
 * 蓝桥杯运行超时
 */
public class ALGO_5 {

	static int[] dis;
	static boolean[] inq;
	static Array[] arr;
	static int n, m;

	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		m = input.nextInt();

		arr = new Array[n + 1];
		dis = new int[n + 1];
		inq = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			arr[i] = new Array();
			dis[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < m; i++) {
			int st = input.nextInt();
			int en = input.nextInt();
			int len = input.nextInt();
			arr[st].ArrayEdge.add(new Edge(en, len));
			
		}
		spfa();
		for (int i = 2; i <= n; i++) {
			System.out.println(dis[i]);
		}

	}
	
	public static void spfa() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1); //从顶点1开始
		dis[1] = 0;
		inq[1] = true;
		// System.out.println(q.size());
		while (q.peek() != null) {
			int now = q.remove();
			inq[now] = false;
			for (Edge edge : arr[now].ArrayEdge) {
				if (dis[edge.to] > dis[now] + edge.value) {
					dis[edge.to] = dis[now] + edge.value;
					if (!inq[edge.to]) {
						q.add(edge.to);
						inq[edge.to] = true;
						// System.out.println(edge.to);
					}
				}
			}
			// System.out.println(q.size());
		}
	}

	
}

class Edge {
	int to;
	int value;

	Edge(int to, int value) {
		this.to = to;
		this.value = value;
	}
}

class Array {
	ArrayList<Edge> ArrayEdge = new ArrayList<Edge>();
}
