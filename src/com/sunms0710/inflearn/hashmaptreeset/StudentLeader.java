package com.sunms0710.inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//학급 회장(해쉬)
public class StudentLeader {
    public static char solution(int n, String str){
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n,str));
    }
}
