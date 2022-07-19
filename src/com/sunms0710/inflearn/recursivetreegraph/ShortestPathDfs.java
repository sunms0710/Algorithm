package com.sunms0710.inflearn.recursivetreegraph;

//Tree 말단 노드까지의 가장 짧은 경로(DFS)
public class ShortestPathDfs {
    Node root;

    public static void main(String[] args) {
        ShortestPathDfs tree = new ShortestPathDfs();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(DFS(0,tree.root));
    }

    private static int DFS(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
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
