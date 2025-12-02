package boj.silver.sort;

// 실버5 2751 수 정렬하기 2

import java.io.*;
import java.util.*;

public class B2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append("\n");
        }

        System.out.println(sb.toString());
    }
}
