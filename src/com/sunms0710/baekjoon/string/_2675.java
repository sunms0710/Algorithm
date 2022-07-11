package com.sunms0710.baekjoon.string;

import java.util.Scanner;

/**
 * 문자열 반복
 * input
 * 2
 * 3 ABC
 * 5 /HTP
 * output
 * AAABBBCCC
 * /////HHHHHTTTTTPPPPP
 */
public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            String str = sc.next();
            for (char c : str.toCharArray()) {
                for(int j = 0; j < n; j++) sb.append(c);
            }
            System.out.println(sb);
            sb = new StringBuilder();
        }
    }
}
