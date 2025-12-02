package boj.bronze.sort;

// 브롡즈2 2750 수 정렬하기

import java.util.*;

public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
