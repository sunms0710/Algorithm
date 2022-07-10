package com.sunms0710.baekjoon.array;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력
 */
public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            hashSet.add(arr[i] % 42);
        }

        System.out.println(hashSet.size());

    }
}
