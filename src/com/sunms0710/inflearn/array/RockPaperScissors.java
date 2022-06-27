package com.sunms0710.inflearn.array;

import java.util.Scanner;

//가위바위보 1:가위 2:바위 3:보
public class RockPaperScissors {
    public static String solution(int n, int[] a, int[] b){
        String answer = "";

        for(int i = 0; i < n; i++){
            if(a[i] == b[i]) answer += "D";
            else if(a[i] == 1 && b[i] == 3) answer += "A";
            else if(a[i] == 2 && b[i] == 1) answer += "A";
            else if(a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] playerA = new int[n];
        for(int i = 0; i < n; i++){
            playerA[i] = sc.nextInt();
        }

        int [] playerB = new int[n];
        for(int i = 0; i < n; i++){
            playerB[i] = sc.nextInt();
        }

        for (char c : solution(n, playerA, playerB).toCharArray()) {
            System.out.println(c);
        }
    }
}
