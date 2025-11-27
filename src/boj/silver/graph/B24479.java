package boj.silver.graph;

// 실버2 24479 알고리즘 수업 - 깊이 우선 탐색 1

import java.util.*;
import java.io.*;

public class B24479 {
    static List<Integer>[] graph; // 인접 리스트
    static int[] visited;         // 방문 순서 기록 배열
    static int order = 1;         // 방문 순서 카운터

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new ArrayList[N + 1];
        visited = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력 (무방향)
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 🔥 오름차순 방문 → 인접 리스트 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 실행
        dfs(R);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb);
    }

    static void dfs(int node) {
        visited[node] = order++;   // 방문 순서 기록

        for (int next : graph[node]) {
            if (visited[next] == 0) {  // 아직 방문 안 한 곳
                dfs(next);
            }
        }
    }

}
