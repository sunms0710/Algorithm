package com.sunms0710.inflearn.hashmaptreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//아나그램(해쉬)
public class Anagram {
    public static String solution(String s1, String s2){
        String answer = "NO";
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if(map1.equals(map2)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(solution(s1,s2));
    }
}
