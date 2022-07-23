package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * 중복순열 구하기
 * 1부터 N까지 번호가 적힌 구슬이 있다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 출력한다.
 * 첫 번째 줄에 자연수 N과 M이 주어진다.
 * 첫 번째 줄의 결과를 출력한다.(사전순으로 오름차순)
 */
public class DuplicatePermutation {
    static int[] pm;
    static int n, m;
    public static void DFS(int L){
        if(L == m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = 1; i <= n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        DFS(0);
    }
}
