package boj.silver.hash;

// 실버5 10815 숫자 카드

import java.io.*;
import java.util.*;

public class B10815 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (set.contains(x)) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }

        System.out.println(sb);
    }
}
