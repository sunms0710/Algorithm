package com.sunms0710.inflearn.recursivetreegraph;

import java.util.Scanner;

/**
 * 재귀함수
 * N을 입력하면 1~N 까지 출력
 */
public class Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    private static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}
