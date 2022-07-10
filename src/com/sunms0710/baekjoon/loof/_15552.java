package com.sunms0710.baekjoon.loof;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 빠른 A+B
 * BufferedReader, StringBuilder 사용
 */
public class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append((a+b)).append("\n");
        }
        System.out.println(sb);
    }
}
