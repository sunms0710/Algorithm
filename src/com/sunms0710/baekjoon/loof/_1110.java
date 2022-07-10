package com.sunms0710.baekjoon.loof;

import java.util.Scanner;

/**
 * 더하기 사이클
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때,
 * 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면
 * 새로운 수를 만들 수 있다.
 */
public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        if(n < 10) n *= 10;

        int tmp = n;
        int left, right;

        while (true){

            left = tmp / 10;
            right = tmp % 10;

            tmp = left + right;
            tmp = right * 10 + tmp % 10;
            cnt++;

            if(n == tmp) break;
        }
        System.out.println(cnt);
    }
}
