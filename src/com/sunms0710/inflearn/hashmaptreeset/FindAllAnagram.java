package com.sunms0710.inflearn.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//모든 아나그램 찾기(해쉬, sliding window)
public class FindAllAnagram {

    public static int solution(String s, String t){
        int answer = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        for (char x : t.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }

        for(int i = 0; i < t.length()-1; i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0) + 1);
        }

        int lt = 0;
        for(int rt = t.length()-1; rt < s.length(); rt++){
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt),0) + 1);
            if(sMap.equals(tMap)) answer++;
            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
            if(sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solution(s,t));
    }
}
