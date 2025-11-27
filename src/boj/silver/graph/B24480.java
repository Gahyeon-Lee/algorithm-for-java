package boj.silver.graph;

// 실버2 24480 알고리즘 수업 - 깊이 우선 탐색 2

import java.util.*;
import java.io.*;

public class B24480 {
    static List<Integer>[] graph;
    static int[] visited;
    static int order = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            graph = new ArrayList[N + 1];
            visited = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            graph[i].sort(Comparator.reverseOrder());
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb);

    }

    static void dfs(int node) {
        visited[node] = order++;

        for (int next : graph[node]) {
            if (visited[next] == 0) {
                dfs(next);
            }
        }
    }

}
