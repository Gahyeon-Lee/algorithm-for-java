package boj.silver.backtracking;

// 실버3 15655 N과 M (6)

import java.util.*;

public class B15655_Backtracking {
    static int n, m;
    static int[] arr;
    static int[] numbers;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        backtrack(0, 0);
        System.out.print(sb);
    }

    static void backtrack(int start, int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arr[depth] = numbers[i];
            backtrack(i + 1, depth + 1);
        }
    }
}
