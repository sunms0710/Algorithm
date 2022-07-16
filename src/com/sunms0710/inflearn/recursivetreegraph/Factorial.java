package com.sunms0710.inflearn.recursivetreegraph;

import java.util.Scanner;

//재귀함수 팩토리얼
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DFS(n));
    }

    private static int DFS(int n) {
        if(n == 1) return 1;
        else {
            return n * DFS(n-1);
        }
    }
}
