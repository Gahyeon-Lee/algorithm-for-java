package boj.silver.sort;

// 실버5 1427 소트인사이

import java.io.*;
import java.util.*;

public class B1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            list.add(digit);
        }

        list.sort(Collections.reverseOrder());
        for (int num : list) {
            System.out.print(num + "");
        }
    }
}
