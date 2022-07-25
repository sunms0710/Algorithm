package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * 조합의 경우수(메모이제이션)
 * nCr = n-1Cr-1 + n-1Cr
 * 첫째 줄에 n과 r이 입력된다.
 * 조합수를 출력한다.
 */
public class CombinationsNumber {

    static int[][] dy = new int[35][35];

    public static int DFS(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(DFS(n,r));
    }
}
