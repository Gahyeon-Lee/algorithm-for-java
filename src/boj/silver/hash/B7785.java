package boj.silver.hash;

// 실5 7785 회사에 있는 사람

import java.io.*;
import java.util.*;

public class B7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        // Set → List 변환
        List<String> list = new ArrayList<>(set);

        // 문자열 내림차순 정렬
        // Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
