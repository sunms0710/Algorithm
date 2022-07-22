package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * n마리의 강아지와 각 무게 w가 주어지면, 최대 c킬로그램까지 태울 수 있는 트럭에
 * 태울 수 있는 가장 무거운 무게를 구하기
 */
public class PutDogInCar {
    static int answer = Integer.MIN_VALUE, c, n;
    public static void DFS(int L, int sum, int[] arr){
        if(sum > c) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        DFS(0,0,arr);
        System.out.println(answer);
    }
}
