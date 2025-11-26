package templates.graph;

import java.util.*;

public class DFS {

    // 그래프를 인접 리스트로 표현 (노드가 0~n-1)
    static List<Integer>[] graph;
    static boolean[] visited; // 방문 여부 체크

    public static void main(String[] args) {
        int n = 7; // 노드 개수 예시
        int start = 0; // 시작 노드 예시

        // 그래프 초기화
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 간선 예시 (양방향)
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 5);
        addEdge(2, 6);

        visited = new boolean[n]; // 방문 체크 배열 초기화

        dfs(start); // DFS 시작
    }

    // 간선 추가 함수 (양방향)
    static void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u); // 무방향 그래프일 경우
    }

    // DFS 함수 (재귀)
    static void dfs(int node) {
        visited[node] = true;  // 현재 노드 방문 처리
        System.out.println("방문 노드: " + node); // 방문 출력

        // 현재 노드의 모든 인접 노드 탐색
        for (int next : graph[node]) {
            if (!visited[next]) {  // 방문하지 않은 노드라면
                dfs(next);         // 재귀 호출
            }
        }
    }
}
