package com.sunms0710.baekjoon.condition;

import java.util.Scanner;

/**
 * 두 수 비교하기
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
public class _1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else {
            System.out.println("==");
        }
    }
}
