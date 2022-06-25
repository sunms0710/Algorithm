package com.sunms0710.inflearn.string;

import java.util.Scanner;

public class ConvertUpLowChar {
    public static String solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);
            if(Character.isUpperCase(tmp)) answer += Character.toLowerCase(tmp);
            else answer += Character.toUpperCase(tmp);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
