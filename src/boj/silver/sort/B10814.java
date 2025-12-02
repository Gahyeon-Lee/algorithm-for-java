package boj.silver.sort;

// 실5 10814 나이순 정렬

import java.io.*;
import java.util.*;

public class B10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            list.add(new String[]{age, name});
        }

        list.sort((a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        StringBuilder sb = new StringBuilder();
        for (String[] p : list) {
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }

        System.out.print(sb);
    }
}
