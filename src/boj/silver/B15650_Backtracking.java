package boj.silver;

// 실버3 15650 N과 M (2)

import java.util.*;

public class B15650_Backtracking {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        backtracking(1, 0);
        System.out.print(sb);
    }

    static void backtracking(int start, int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            backtracking(i + 1, depth + 1);
        }
    }
}
