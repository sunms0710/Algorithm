package com.sunms0710.baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

/**
 * M 이상 N 이하의 소수를 모두 출력
 * input: 3 16
 * output: 3 5 7 11 13
 */
public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i <= n; i++){
            if(isPrime(i)) sb.append(i).append("\n");
        }

        bw.write(String.valueOf(sb));
        bw.flush();

    }
    private static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
