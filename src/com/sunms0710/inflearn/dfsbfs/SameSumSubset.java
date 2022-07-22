package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * 합이 같은 부분집합
 * N개의 원소로 구성된 자연수 집합이 주어지면 이 집합을 두 개의 부분집합으로 나누었을 때,
 * 두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 YES, 아니면 NO 출력
 */
public class SameSumSubset {
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public static void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum > total/2) return;
        if(L == n){
            if((total - sum) == sum){
                answer = "YES";
                flag=true;
            }
        }else{
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0,0,arr);
        System.out.println(answer);
    }
}

