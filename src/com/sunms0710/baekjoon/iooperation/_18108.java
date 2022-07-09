package com.sunms0710.baekjoon.iooperation;

import java.util.Scanner;

/**
 * 불기연도 -> 서기연도
 * input: 2541
 * output: 1998
 */
public class _18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year - 543);
    }
}
