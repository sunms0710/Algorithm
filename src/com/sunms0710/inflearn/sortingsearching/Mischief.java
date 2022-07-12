package com.sunms0710.inflearn.sortingsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때
 * 철수가 받은 번호와 철수 짝꿍이 받은 번호를 차례로 출력
 * input
 * 9
 * 120 125 152 130 135 135 143 127 160
 * output
 * 3 8
 */
public class Mischief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        for (int i : solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(arr[i] != tmp[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }
}
