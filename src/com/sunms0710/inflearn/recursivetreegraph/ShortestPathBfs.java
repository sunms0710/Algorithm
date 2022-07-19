package com.sunms0710.inflearn.recursivetreegraph;

import java.util.LinkedList;
import java.util.Queue;

//Tree 말단 노드까지의 가장 짧은 경로(BFS)
public class ShortestPathBfs {
    Node root;

    public static void main(String[] args) {
        ShortestPathBfs tree = new ShortestPathBfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(BFS(tree.root));
    }

    private static int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                Node cur = q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) q.offer(cur.lt);
                if(cur.rt != null) q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    static class Node{
        int data;
        Node lt, rt;
        public Node(int val){
            data = val;
            lt = rt = null;
        }
    }
}
