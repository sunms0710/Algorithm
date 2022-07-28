package com.sunms0710.inflearn.dfsbfs;

import java.util.Scanner;

/**
 * 미로탐색(DFS)
 * 7 * 7 격자판에서 출발점은 (1,1)이고 도착점은 (7,7)이다. 1은 벽이고 0은 통로이다.
 * 도착점에서 갈 수 있는 방법의 수를 출력
 * 0 0 0 0 0 0 0
 * 0 1 1 1 1 1 0
 * 0 0 0 1 0 0 0
 * 1 1 0 1 0 1 1
 * 1 1 0 0 0 0 1
 * 1 1 0 1 1 0 0
 * 1 0 0 0 0 0 0
 */
public class MazeExploration {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int answer = 0;

    public static void DFS(int x, int y){
        if(x == 7 && y == 7) answer++;
        else{
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    DFS(nx,ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        DFS(1,1);
        System.out.println(answer);
    }
}
