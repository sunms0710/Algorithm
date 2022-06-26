package com.sunms0710.inflearn.string;

import java.util.Scanner;

//중복 문자 제거
public class DeleteSameWord {
    public static String solution(String str){
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
