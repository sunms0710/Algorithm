package com.sunms0710.inflearn.string;

import java.util.Scanner;

public class FindChar {
    public static int solution(String str, char c){
        int count = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
