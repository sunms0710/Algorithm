package com.sunms0710.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//괄호 문자 제거
public class RemoveParentheses {
    public static String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if (c == ')') {
                while (stack.pop() != '(');
            }else stack.push(c);
        }

        for (char c : stack) {
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
