package com.sunms0710.inflearn.recursivetreegraph;

import java.util.Scanner;

/**
 * 재귀함수를 이용하여 N을 이진수로 변환하여 출력
 */
public class RecursiveBinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DFS(n);
    }

    private static void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}
