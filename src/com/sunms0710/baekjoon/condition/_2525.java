package com.sunms0710.baekjoon.condition;

import java.util.Scanner;

/**
 * 오븐 시계
 * input
 * 첫째 줄: 현재 시각 H (0 ≤ A ≤ 23) M (0 ≤ B ≤ 59)
 * 두번째 줄: 요리하는 데 필요한 시간 T (0 ≤ C ≤ 1,000) (분 단위)
 */
public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int allMinute = h * 60 + m + t;
        h = allMinute / 60;
        m = allMinute % 60;

        if(h >= 24) h -= 24;

        System.out.println(h + " " + m);
    }
}
