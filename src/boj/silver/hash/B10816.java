package boj.silver.hash;

// 실버4 10816 숫자 카드 2

import java.io.*;
import java.util.*;

public class B10816 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++){
            int q = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(q, 0)).append(' ');
        }

        System.out.println(sb);
    }
}
