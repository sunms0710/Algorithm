package com.sunms0710.inflearn.string;

import java.util.Scanner;

public class FindLongStr {
    public static String solution(String str){
        String answer = "";
        int m = -1;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
