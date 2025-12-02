package boj.bronze.sort;

// 브론즈1 10989 수 정렬하기 3

import java.io.*;
import java.util.*;

public class B10989 {

    /**
     * 이 문제의 핵심은 일반 정렬이 아닌 계수 정렬 (Counting Sort)
     * 학부생 당시에는 열심히 배웠지만 현재는 기억에서 삭제됐다
     */

    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[x]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }

            // 축약 문법
            /*
            while (arr[i]-- > 0) {
                sb.append(i).append('\n');
            }
            */
        }

        System.out.println(sb);
    }
}
