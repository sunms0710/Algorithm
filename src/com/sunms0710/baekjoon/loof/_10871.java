package com.sunms0710.baekjoon.loof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * X보다 작은 수
 * input
 * 10 5
 * 1 10 4 9 2 3 8 5 7 6
 * output
 * 1 4 2 3
 */
public class _10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int value = Integer.parseInt(st.nextToken());
            if(value < k) sb.append(value).append(" ");
        }

        System.out.println(sb);

    }
}
