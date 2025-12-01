package boj.silver.hash;

// 실버3 11478 서로 다른 부분 문자열의 개수

import java.util.*;

public class B11478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                set.add(s.substring(i, j + 1));
            }
        }

        System.out.println(set.size());
    }
}
