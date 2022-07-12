package com.sunms0710.baekjoon.math;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 자연수 M과 N이 주어질 때 M 이상 N 이하의 자연수 중 소수인 것을 모두 골라 소수의 합과 최솟값을 찾는 프로그램
 * input
 * 60
 * 100
 * output
 * 620
 * 61
 * M 이상 N 이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력
 */
public class _2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = m; i <= n; i++){
            if(isPrime(i)) list.add(i);
        }

        if(list.size() == 0) System.out.println(-1);
        else {
            int sum = 0;
            int min = 10001;
            for(int i = 0; i < list.size(); i++){
                sum += list.get(i);
                if(min > list.get(i)){
                    min = list.get(i);
                }
            }
            System.out.println(sum);
            System.out.println(min);
        }

    }

    private static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
