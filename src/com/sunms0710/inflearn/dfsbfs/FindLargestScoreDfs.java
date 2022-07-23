package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 *최대 점수 구하기
 * 첫 번째 줄에 문제의 개수 N과 제한시간 M이 주어진다.
 * 두 번째 줄부터 N줄에 걸쳐 문제를 풀었을 때의 점수와 푸는데 걸리는 시간이 주어진다.
 * 제한시간 안에 얻을 수 있는 최대 점수를 출력한다.
 */
public class FindLargestScoreDfs {
    static int answer = Integer.MIN_VALUE, n, m;
    static boolean flag = false;

    public static void DFS(int L, int sum, int time, int[] ps, int[] pt){
        if(time > m) return;
        if(L == n){
            answer = Math.max(answer, sum);
        }else {
            DFS(L+1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        DFS(0,0, 0, a, b);
        System.out.println(answer);
    }

}
