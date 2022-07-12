package com.sunms0710.inflearn.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 중복 확인
 * input
 * 8
 * 20 25 52 30 39 33 43 33
 * output
 * D
 */
public class CheckDuplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,arr));
    }

    private static char solution(int n, int[] arr) {
        char answer = 'U';
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i] == arr[i+1]) return 'D';
        }
        return answer;
    }
}
