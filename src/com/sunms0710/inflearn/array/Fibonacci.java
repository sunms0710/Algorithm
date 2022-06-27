package com.sunms0710.inflearn.array;

import java.util.Scanner;

//피보나치 수열
public class Fibonacci {
    public static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = answer[1] = 1;
        for(int i = 2; i < n; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }
}
