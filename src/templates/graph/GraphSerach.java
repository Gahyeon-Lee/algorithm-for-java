package templates.graph;

import java.util.*;

public class GraphSerach {

    // 상하좌우 이동용 델타 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m;              // 행(n), 열(m)
    static int[][] grid;           // 맵 정보
    static boolean[][] visited;    // 방문 체크

    public static void main(String[] args) {
        n = 5;
        m = 5;
        grid = new int[][] {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };

        visited = new boolean[n][m];

        // DFS 예시: 모든 연결된 영역 탐색
        int countDFS = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    dfs(i, j);
                    countDFS++;
                }
            }
        }
        System.out.println("DFS로 탐색한 연결 영역 수: " + countDFS);

        // BFS 예시: 시작점 (0,0) 기준 최단 거리 계산
        visited = new boolean[n][m]; // BFS 전 방문 배열 초기화
        int[][] distance = bfs(0, 0);
        System.out.println("BFS로 계산한 거리:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(distance[i]));
        }

    }

    // DFS 함수 (재귀)
    static void dfs(int x, int y) {
        visited[x][y] = true;
        // 현재 노드 방문 처리
        // System.out.println("DFS 방문: (" + x + "," + y + ")");

        // 상하좌우 탐색
        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위 체크 + 방문 여부 + 이동 가능 여부(1이면 이동)
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (!visited[nx][ny] && grid[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }

    // BFS 함수: 시작점 기준 거리 계산
    static int[][] bfs(int startX, int startY) {
        int[][] dist = new int[n][m];
        for (int[] row : dist) Arrays.fill(row, -1); // -1: 미방문
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        dist[startX][startY] = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && grid[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        dist[nx][ny] = dist[x][y] + 1; // 거리 계산
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return dist;
    }
}
