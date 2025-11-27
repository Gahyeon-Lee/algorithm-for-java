package boj.silver.backtracking;

// 실버3 15654 N과 M (5)

import java.util.*;

public class B15654_Backtracking {
    static int n, m;
    static int[] arr;
    static int[] nums;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        nums = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        backtrack(0);
        System.out.println(sb);
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = nums[i];
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}
