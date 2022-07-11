package com.sunms0710.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
 * input: Mississipi
 * output: ?
 * input: baaa
 * output: A
 */
public class _1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'A']++;
        }

        int max = -1;
        char answer = '?';

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                answer = (char)(i + 'A');
            }else if(arr[i] == max){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
