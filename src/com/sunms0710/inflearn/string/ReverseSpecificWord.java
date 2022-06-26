package com.sunms0710.inflearn.string;

import java.util.Scanner;
//특정 문자 뒤집기
public class ReverseSpecificWord {
    public static String solution(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt){
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if (!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
