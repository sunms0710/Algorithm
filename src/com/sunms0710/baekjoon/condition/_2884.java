package com.sunms0710.baekjoon.condition;

import java.util.Scanner;

/**
 * 알람 시계
 * 45분 일찍 알람 설정하기
 * input: H M (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
 * output: 설정해야 하는 알람 시간 H M
 */
public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45){
            h--;
            if(h < 0) h = 23;
            System.out.println(h + " " + (60 - (45 - m)));
        }else System.out.println(h + " " + (m - 45));
    }
}
