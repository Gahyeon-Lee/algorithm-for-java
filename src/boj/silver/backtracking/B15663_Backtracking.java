package boj.silver.backtracking;

// 실버2 15663 N과 M (9)

import java.util.*;

public class B15663_Backtracking {
    static int n, m;
    static int[] arr;
    static int[] numbers;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        numbers = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        backtrack(0);
        System.out.println(sb);
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            if (i > 0 && numbers[i] == numbers[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            arr[depth] = numbers[i];
            backtrack(depth + 1);
            visited[i] = false;
        }
    }
}
