package boj.silver.hash;

// 실버4 1620 나는야 포켓몬 마스터 이다솜

import java.io.*;
import java.util.*;

public class B1620 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 이름 -> 번호
        Map<String, Integer> nameToIndex = new HashMap<>();
        // 번호 -> 이름 (1 ~ N)
        // key로 value 찾는 건 빠른데 그 반대는 어려우니까... 그냥 배열로 빠르게 찾아버리기!
        String[] indexToName = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToIndex.put(name, i);
            indexToName[i] = name;
        }

        for (int i = 0; i < m; i++) {
            String q = br.readLine();

            if (q.charAt(0) >= '0' && q.charAt(0) <= '9') {
                int idx = Integer.parseInt(q);
                sb.append(indexToName[idx]).append('\n');
            } else {
                sb.append(nameToIndex.get(q)).append('\n');
            }
        }

        System.out.print(sb);
    }
}
