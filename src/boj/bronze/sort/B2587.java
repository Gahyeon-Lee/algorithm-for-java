package boj.bronze.sort;

// 브론즈2 2587 대표값2

import java.util.*;

public class B2587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int num : list) {
            sum += num;
        }

        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}
