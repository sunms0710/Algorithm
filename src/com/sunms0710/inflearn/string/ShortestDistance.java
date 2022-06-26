package com.sunms0710.inflearn.string;

import java.util.Scanner;

//가장 짧은 문자거리
public class ShortestDistance {
    public static int[] solution(String str, char t){
        int[] answer = new int[str.length()];
        int p = 1000;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == t){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int x : solution(str, t)) {
            System.out.print(x + " ");
        }
    }
}
