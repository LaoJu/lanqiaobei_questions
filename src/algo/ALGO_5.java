package algo;

import java.util.Scanner;
import java.util.*;

/**
 * ��Ȩ����Ϊ����dijkstra̰��˼�룬�ڴ˲���ʹ��
 * 
 * SPFA�㷨--��̬�ƽ�
 * 1.����һ���Ƚ��ȳ����б�����Ż��Ľڵ�
 * 2.�Ż�ʱȡ����u����u��ǰ�����·������ֵ��u��������v�����ɳڲ���
 * 3.��v�����·�е�����v���ڴ��Ż����У�����v����β
 * 4.������������ֱ������Ϊ��
 * �����ĳ���������еĴ�������N������ڸ�����SPFA�޷������������ͼ��
 * 
 * ���ű����г�ʱ
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
		q.add(1); //�Ӷ���1��ʼ
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
