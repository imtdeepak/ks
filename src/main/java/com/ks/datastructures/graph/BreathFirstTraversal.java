package com.ks.datastructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstTraversal
{
    private final int node;       /* total number of nodes in the graph */
    private LinkedList<Integer>[] adj;      /* adjacency list */
    private Queue<Integer> que;           /* maintaining a queue */
    BreathFirstTraversal(int v)
    {
        node = v;
        adj = new LinkedList[node];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<>();
    }
    void insertEdge(int v,int w)
    {
        adj[v].add(w);      /* adding an edge to the adjacency list (edges are bidirectional in this example) */
    }

    /**
     *
     * @param n is  input node to do BFS Traverse
     */

    public ArrayList<Integer> BFS(int n)
    {
        ArrayList<Integer> bfsTraversedList = new ArrayList<>();
        boolean[] visited = new boolean[node];       /* initialize boolean array for holding the data */
        int a = 0;
        System.out.printf("Breadth First Traversal for the graph from node %d is: => ", n);
        //start from n node
        visited[n]=true;
        que.add(n);       /* root node is added to the top of the queue */
        while (!que.isEmpty())
        {
            n = que.poll();        /* remove the top element of the queue */
            bfsTraversedList.add(n);
            for (int i = 0; i < adj[n].size(); i++)  /* iterate through the linked list and push all neighbors into queue */
            {
                a = adj[n].get(i);
                if (!visited[a])      /* only insert visited into queue if they have not been explored already */
                {
                    visited[a] = true;
                    que.add(a);
                }
            }
        }
        return bfsTraversedList;
    }
    public static void main(String[] args)
    {
        BreathFirstTraversal graph = new BreathFirstTraversal(6);
        /** Graph example
         *  0 -> 1, 3, 4
         *  1 -> 2, 0
         *  2 -> 1
         *  3 -> 1, 5
         *  4 -> 5, 1
         *  5 -> 4, 3
         *              0
         *          1   3    4
         *          2      5
         */
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);

        System.out.println(graph.BFS(0));
        System.out.println(graph.BFS(3));
    }
}
