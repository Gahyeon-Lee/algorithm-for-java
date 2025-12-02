package boj.bronze.sort;

// 브론즈2 25305 커트라인

import java.util.*;

public class B25305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        list.sort(Collections.reverseOrder());

        System.out.println(list.get(k - 1));
    }
}
