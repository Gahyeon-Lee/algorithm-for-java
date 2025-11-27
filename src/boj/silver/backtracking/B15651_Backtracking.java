package boj.silver.backtracking;

// 실버3 15651 N과 M (3)

import java.util.*;

public class B15651_Backtracking {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        backtrack(0);
        System.out.print(sb);
    }

    static void backtrack(int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;
            backtrack(depth + 1);
        }
    }
}
