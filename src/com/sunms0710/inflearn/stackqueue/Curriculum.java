package com.sunms0710.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육 과정 설계
public class Curriculum {

    private static String solution(String s1, String s2){
        String answer = "NO";
        Queue<Character> queue = new LinkedList<>();
        for (char c : s1.toCharArray()) {
            queue.offer(c);
        }

        for(int i = 0; i < s2.length(); i++){
            if(queue.contains(s2.charAt(i)) && queue.peek() == s2.charAt(i)) queue.poll();
        }

        if(queue.size() == 0) return "YES";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1, s2));
    }
}
