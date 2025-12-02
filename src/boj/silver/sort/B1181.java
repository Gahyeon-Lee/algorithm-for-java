package boj.silver.sort;

// 실버5 1181 단어 정렬

import java.io.*;
import java.util.*;

public class B1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            list.add(s);
        }

        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        list.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
