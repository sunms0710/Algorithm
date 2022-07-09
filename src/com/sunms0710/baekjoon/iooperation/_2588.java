package com.sunms0710.baekjoon.iooperation;

import java.util.Scanner;

/**
 * 곱셈
 * input
 * 472
 * 385
 * output
 * 2360
 * 3776
 * 1416
 * 181720
 */
public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
