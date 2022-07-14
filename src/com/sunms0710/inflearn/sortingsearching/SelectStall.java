package com.sunms0710.inflearn.sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 마구간 정하기(결정 알고리즘)
 * C 마리의 말을 N개의 마구간에 배치했을 때 가장 가까운 두 말의 거리가 최대가 되는 그 최대값을 출력
 * input
 * 5 3
 * 1 2 8 4 9
 * output
 * 3
 */
public class SelectStall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,c,arr));
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while (lt <= rt){
            int mid = (lt + rt)/2;
            if(count(arr,mid) >= c){
                answer = mid;
                lt = mid + 1;
            }else rt = mid - 1;
        }


        return answer;
    }

    private static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
