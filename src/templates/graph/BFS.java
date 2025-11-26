package templates.graph;

import java.util.*;

public class BFS {
    // 그래프를 인접 리스트로 표현 (노드가 0~n-1)
    static List<Integer>[] graph;
    static boolean[] visited; // 방문 여부 체크
    static int[] distance;    // 시작 노드로부터 거리 저장 (필요 시)

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

        visited = new boolean[n];
        distance = new int[n]; // 시작 노드에서 각 노드까지 거리 저장
        Arrays.fill(distance, -1); // 초기값 -1: 아직 방문 안 함

        bfs(start);

        // 결과 출력
        System.out.println("노드별 거리:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }

    // 간선 추가 함수 (양방향)
    static void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u); // 무방향 그래프일 경우
    }

    // BFS 함수
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);     // 시작 노드를 큐에 넣음
        visited[start] = true;  // 시작 노드 방문 처리
        distance[start] = 0;    // 시작 노드 거리 0

        while (!queue.isEmpty()) {
            int cur = queue.poll(); // 큐에서 현재 노드 꺼내기

            // 현재 노드의 모든 인접 노드 탐색
            for (int next : graph[cur]) {
                if (!visited[next]) {   // 방문하지 않았다면
                    visited[next] = true;      // 방문 처리
                    distance[next] = distance[cur] + 1; // 거리 갱신
                    queue.offer(next);         // 큐에 넣어 다음에 탐색
                }
            }
        }
    }

}
