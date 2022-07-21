package com.sunms0710.inflearn.recursivetreegraph;

import java.util.Scanner;

/**
 * 경로 탐색(인접 행렬, DFS)
 * input: 첫째 줄에 정점의 수 N, 간선의 수 M이 입력되고, 둘째 줄부터 연결 정보가 입력된다.
 * output: 1번 정점에서 N번 정점으로 가는 모든 경로의 총 가지수를 출력
 */
public class RouteSearchingDfs {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public static void DFS(int v){
        if(v==n) answer++;
        else {
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
