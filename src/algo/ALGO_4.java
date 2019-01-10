package algo;

import java.io.*;
import java.util.*;

//TODO
public class ALGO_4 {
	final static int MAX = 100010;
	int edgecount;
	int tree[] = new int[MAX];
	int dp[][] = new int[MAX][2];
	int visit[] = new int[MAX * 2];
	boolean visited[] = new boolean[MAX];

	class Edge {
		int start, end, next;

		Edge(int s, int e, int n) {
			start = s;
			end = e;
			next = n;
		}
	}

	Edge edge[] = new Edge[MAX * 2];

	void add(int start, int end) {
		edge[edgecount] = new Edge(start, end, tree[start]);
		tree[start] = edgecount++;
	}

	void dfs(int x, int x_father) {
		Arrays.fill(visited, false);
		int temp = 0;
		visited[x] = true;
		visit[temp++] = x;
		while (temp > 0) {
			x = visit[temp - 1];
			boolean edgevisited = false;
			for (int i = tree[x]; i + 1 != 0; i = edge[i].next) {
				int end = edge[i].end;
				if (visited[end])
					continue;
				edgevisited = true;
				visit[temp++] = end;
				visited[end] = true;
			}
			if (edgevisited)
				continue;
			--temp;
			for (int i = tree[x]; i + 1 != 0; i = edge[i].next) {
				int x_son = edge[i].end;
				dp[x_son][0] += Math.max(dp[x][0], dp[x][1]);
				dp[x_son][1] += dp[x][0];

			}
		}
	}

	void run() throws IOException {
		int n = cin.nextInt();
		for (int i = 1; i <= n; ++i)
			dp[i][1] = cin.nextInt();
		Arrays.fill(tree, -1);
		for (int i = 1; i < n; ++i) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			add(x, y);
			add(y, x);
		}
		dfs(1, 0);
		int ans = Math.max(dp[1][0], dp[1][1]);
		out.println(ans);
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new ALGO_4().run();
	}

	ALGO_4() {
		cin = new InputReader(System.in);
		out = new PrintWriter(System.out);
	}

	InputReader cin;
	PrintWriter out;

	class InputReader {
		InputReader(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = new StringTokenizer("");
		}

		private String next() throws IOException {
			while (!tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		public Integer nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		private BufferedReader reader;
		private StringTokenizer tokenizer;
	}
}
