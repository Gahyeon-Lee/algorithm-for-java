package boj.silver.hash;

// 실버4 1764 듣보잡

import java.io.*;
import java.util.*;

public class B1764 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> heard = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            heard.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (heard.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
