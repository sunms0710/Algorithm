package com.sunms0710.inflearn.dfsbfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 동전교환
 * 첫 번째 줄에는 동전의 종류 개수 N이 주어진다.
 * 두 번째 줄에는 N개의 동전의 종류가 주어진다.
 * 그 다음줄부터 거슬러 줄 금액 M이 주어진다.
 * 거슬러 줄 동전의 최소 개수를 출력한다.
 */
public class CoinChange {
    static int n, m, answer = Integer.MAX_VALUE;
    public static void DFS(int L, int sum, Integer[] arr){
        if(sum > m) return;
        if(L >= answer) return;
        if(sum == m){
            answer = Math.min(answer, L);
        }else{
            for(int i = 0; i < n; i++){
                DFS(L+1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        DFS(0,0,arr);
        System.out.println(answer);
    }
}
