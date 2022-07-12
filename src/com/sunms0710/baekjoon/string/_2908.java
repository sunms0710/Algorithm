package com.sunms0710.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 숫자 거꾸로 비교해서 큰값
 * input: 734 893
 * output: 437
 */
public class _2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int a = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());
        sb = new StringBuilder();
        int b = Integer.parseInt(sb.append(st.nextToken()).reverse().toString());

        System.out.println(Math.max(a,b));
    }
}
