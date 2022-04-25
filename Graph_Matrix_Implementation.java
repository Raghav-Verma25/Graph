package com.company;

public class Graph_Matrix_Implementation {
    int v;
    int e;
    int[][] adjacent;

    public Graph_Matrix_Implementation(int nodes) {
        this.adjacent = new int[nodes][nodes];
        this.v = nodes;
        int e = 0;
    }

    public static void main(String[] args) {
        Graph_Matrix_Implementation g = new Graph_Matrix_Implementation(4);
        g.addEdges(0, 1);
        g.addEdges(1, 2);
        g.addEdges(2, 3);
        g.addEdges(3, 0);
        // System.out.println();
        g.print();
    }

    public void addEdges(int u, int v) {
        adjacent[u][v] = 1;
        adjacent[v][u] = 1;
    }

    public void print() {
        for (int i = 0; i < v; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < v; j++) {
                System.out.print(adjacent[i][j] + " ");
            }
            System.out.println();
        }
    }

}
