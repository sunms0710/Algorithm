package com.sunms0710.inflearn.recursivetreegraph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 경로 탐색(인접 리스트, ArrayList)
 * input: 첫째 줄에 정점의 수 N, 간선의 수 M이 입력되고, 둘째 줄부터 연결 정보가 입력된다.
 * output: 1번 정점에서 N번 정점으로 가는 모든 경로의 총 가지수를 출력
 */
public class RouteSearchingArrayList {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void DFS(int v){
        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
