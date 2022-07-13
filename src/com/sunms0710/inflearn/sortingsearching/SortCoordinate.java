package com.sunms0710.inflearn.sortingsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 좌표 정렬
 * input
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 * output
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */
public class SortCoordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for (Point p : arr) {
            System.out.println(p.x + " " + p.y);
        }

    }

    static class Point implements Comparable<Point>{
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }
}
