package com.sunms0710.inflearn.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분 검색
 * input
 * 8 32
 * 23 87 65 12 57 32 99 81
 * output
 * 3
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if(arr[mid] > m) rt = mid -1;
            else lt = mid + 1;
        }
        return answer;
    }
}
