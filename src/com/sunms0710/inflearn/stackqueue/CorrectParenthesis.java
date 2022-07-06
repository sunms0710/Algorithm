package com.sunms0710.inflearn.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//올바른 괄호
public class CorrectParenthesis {
    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
