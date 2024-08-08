package com.ks.datastructures.graph;

import java.util.*;

public class BreathFirstTraversal {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        graph.add((ArrayList<Integer>) Arrays.asList(1,2,3));
        graph.add((ArrayList<Integer>) Arrays.asList(1, 2, 3));
        graph.add((ArrayList<Integer>) Arrays.asList(1,4, 5, 3));
        graph.add((ArrayList<Integer>) Arrays.asList(1, 2, 6));
        graph.add((ArrayList<Integer>) Arrays.asList(2,6));
        graph.add((ArrayList<Integer>) Collections.singletonList(2));
        graph.add((ArrayList<Integer>) Arrays.asList(3,4));


        BreathFirstTraversal breathFirstTraversal = new BreathFirstTraversal();
        ArrayList<Integer> traversal = breathFirstTraversal.bfsTraversal(
                , graph);

        System.out.println(traversal);

    }

    public ArrayList<Integer> bfsTraversal(int numberOfNodes, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[numberOfNodes];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);
            for(Integer it : adjList.get(node)) {
                if(!visited[it]) {
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
