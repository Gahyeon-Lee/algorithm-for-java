package boj.silver.sort;

// 실버5 11651 좌표 정렬하기 2

import java.io.*;
import java.util.*;

public class B11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new int[]{x, y});
        }

        list.sort((a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] p : list) {
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }

        System.out.print(sb);
    }
}
