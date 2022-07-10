package com.sunms0710.baekjoon.array;

import java.util.Scanner;

/**
 * OX퀴즈
 * OOXXOXXOOO의 점수는 1+2+0+0+1+0+0+1+2+3 = 10
 */
public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int cnt = 0, sum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        for (String str : arr) {
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'O'){
                    cnt++;
                    sum += cnt;
                }else cnt = 0;
            }
            System.out.println(sum);
            cnt = 0;
            sum = 0;
        }
    }
}
