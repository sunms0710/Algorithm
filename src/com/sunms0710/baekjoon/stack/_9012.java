package com.sunms0710.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 괄호 판단
 * input
 * 3
 * ((
 * ))
 * ())(()
 * output
 * NO
 * NO
 * NO
 */
public class _9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        for (String str : arr) {
            System.out.println(solution(str));
        }

    }

    private static String solution(String str){
        Stack<Character> stack = new Stack<>();
        String answer = "YES";
        for (char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
