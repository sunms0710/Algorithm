package com.sunms0710.inflearn.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직 비디오(결정 알고리즘)
 * input
 * 9 3
 * 1 2 3 4 5 6 7 8 9
 * output
 * 17
 */
public class MusicVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m){
                answer = mid;
                rt = mid - 1;
            }else lt = mid + 1;
        }
        return answer;
    }

    private static int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int n : arr){
            if(sum + n > capacity){
                cnt++;
                sum = n;
            }else sum += n;
        }
        return cnt;
    }
}
