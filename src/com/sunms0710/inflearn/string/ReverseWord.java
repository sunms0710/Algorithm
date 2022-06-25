package com.sunms0710.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
    public static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            /* StringBuilder 이용
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp); */
            char[] c = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while(lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        for (String s : solution(n,str)) {
            System.out.println(s);
        }
    }
}
