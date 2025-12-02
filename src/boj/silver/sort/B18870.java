package boj.silver.sort;

// 실버2 18870 좌표 압축

import java.io.*;
import java.util.*;

public class B18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr =  new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        HashMap<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for (int v : list) {
            map.put(v, idx++);
        }

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(map.get(x)).append(" ");
        }

        System.out.println(sb);
    }
}
