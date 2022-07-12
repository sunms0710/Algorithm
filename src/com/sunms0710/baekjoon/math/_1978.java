package com.sunms0710.baekjoon.math;

import java.util.Scanner;

/**
 * 소수 찾기
 * input
 * 4
 * 1 3 5 7
 * output
 * 3
 */
public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;

        for (int i : arr) {
            if(isPrime(i)) cnt++;
        }

        System.out.println(cnt);
    }
    private static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
