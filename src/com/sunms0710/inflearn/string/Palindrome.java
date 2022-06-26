package com.sunms0710.inflearn.string;

import java.util.Scanner;
//회문 문자열
public class Palindrome {
    public static String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) answer = "NO";
        }
        /* StringBuilder 이용
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        */
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
