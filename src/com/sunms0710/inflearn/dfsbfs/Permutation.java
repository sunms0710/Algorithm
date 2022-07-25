package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * 순열 구하기
 * N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력
 */
public class Permutation {
    static int[] pm, ch, arr;
    static int n, m;

    public static void DFS(int L){
        if(L == m){
            for(int i : pm) System.out.print(i + " ");
            System.out.println();
        }else{
            for(int i = 0; i < n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
