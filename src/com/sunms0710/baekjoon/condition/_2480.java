package com.sunms0710.baekjoon.condition;

import java.util.Scanner;

/**
 * 주사위 세개
 * 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * input: 3 3 6
 * output: 1300
 */
public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;

        if(a == b && b == c && a == c){
            result = 10000 + a * 1000;
        } else if(a == b || a == c){
            result = 1000 + a * 100;
        } else if(b == c){
            result = 1000 + b * 100;
        } else {
            result = Math.max(Math.max(a,b), c) * 100;
        }

        System.out.println(result);
    }
}
