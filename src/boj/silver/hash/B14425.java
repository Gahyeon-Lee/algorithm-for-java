package boj.silver.hash;

// 실버4 14425 문자열 집합

import java.io.*;
import java.util.*;

public class B14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int  i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
