package boj.silver.graph;

// 실버2 1260 DFS와 BFS

import java.util.*;
import java.io.*;

public class B1260 {
    static int n, m, s;
    static List<Integer>[] graph;
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        visitedDfs = new boolean[n + 1];
        visitedBfs = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(s);
        System.out.println();
        bfs(s);
    }

    static void dfs(int start) {
        visitedDfs[start] = true;
        System.out.print(start + " ");

        for (int next : graph[start]) {
            if (!visitedDfs[next]) {
                visitedDfs[next] = true;
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visitedBfs[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int next : graph[cur]) {
                if (!visitedBfs[next]) {
                    visitedBfs[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
