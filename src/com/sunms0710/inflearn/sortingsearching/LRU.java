package com.sunms0710.inflearn.sortingsearching;

import java.util.Scanner;

/**Least Recently Used
 * input
 * S (3<=S<=10), N (5<=N<=1000)
 * N개의 작업번호 (1~100)
 * output
 * 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력
 */
public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i : solution(s, n, arr)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < s; i++) {
                if(x == cache[i]){
                    pos = i;
                }
            }
            if(pos == -1){
                for(int i = s - 1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        return cache;
    }
}
