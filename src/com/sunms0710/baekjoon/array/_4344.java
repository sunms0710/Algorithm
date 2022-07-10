package com.sunms0710.baekjoon.array;

import java.util.Scanner;

/**
 *평균은 넘겠지
 * input
 * 5
 * 5 50 50 70 80 100
 * 7 100 95 90 80 70 60 50
 * 3 70 90 80
 * 3 70 90 81
 * 9 100 99 98 97 96 95 94 93 91
 * output
 * 40.000%
 * 57.143%
 * 33.333%
 * 66.667%
 * 55.556%
 */
public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for(int i = 0; i < c; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            double sum = 0;
            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            double avg = sum / n;
            double cnt = 0;

            for(int j = 0; j < n; j++){
                if(arr[j] > avg) cnt++;
            }
            System.out.printf("%.3f%%\n", (cnt / n) * 100);
        }
    }
}
