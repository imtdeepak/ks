package com.ks.datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ahil
 */
public class Dijkstra
{

}

//    public static void main(String[] args)
//    {
//        Graph graph = new Graph();
//
//        // initialize the vertex
//        Vertex vertex1 = new Vertex("a");
//        Vertex vertex2 = new Vertex("b");
//        Vertex vertex3 = new Vertex("c");
//        Vertex vertex4 = new Vertex("d");
//        Vertex vertex5 = new Vertex("e");
//        Vertex vertex6 = new Vertex("f");
//
//        graph.addVertex(vertex1);
//        graph.addVertex(vertex2);
//        graph.addVertex(vertex3);
//        graph.addVertex(vertex4);
//        graph.addVertex(vertex5);
//        graph.addVertex(vertex6);
//
//
//        // Declare edge
//        graph.addEdge(vertex1, vertex2, 7);
//        graph.addEdge(vertex1, vertex3, 9);
//        graph.addEdge(vertex1, vertex6, 14);
//        graph.addEdge(vertex2, vertex3, 10);
//        graph.addEdge(vertex2, vertex4, 15);
//        graph.addEdge(vertex3, vertex4, 11);
//        graph.addEdge(vertex3, vertex6, 2);
//        graph.addEdge(vertex4, vertex5, 6);
//        graph.addEdge(vertex5, vertex6, 9);
//    }
//}
//
//class Graph<T>
//{
//
//    private HashMap<String, Vertex> vertexHashMap = new HashMap();
//    public void addVertex(Vertex vertex){
//        vertexHashMap.put(vertex.getLabel(), vertex);
//    }
//
//    public void addEdge(Vertex one, Vertex two, int weight){
//        Edge edge = new Edge(one, two, weight);
//
//        // Add the edge to both source and destination
//        Vertex vertex1 = vertexHashMap.get(one.getLabel());
//        vertex1.getNeighbours().add(edge);
//
//        Vertex vertex2 = vertexHashMap.get(two.getLabel());
//        vertex2.getNeighbours().add(edge);
//    }
//
//    public void displayAdjacent(){
//        for(Map.Entry<String, Vertex> entry : vertexHashMap.entrySet()) {
//            String label = entry.getKey();
//            Vertex vertex = entry.getValue();
//            String vertexLabel = vertex.getLabel();
//            List neighbours = vertex.getNeighbours();
//
//            for()
//            System.out.println();
//        }
//    }
//}
//
//class Edge<T extends Comparable>
//        implements Comparable
//{
//    private Vertex source;
//    private Vertex destination;
//    private T      weight;
//
//    public Edge(Vertex source, Vertex destination, T weight)
//    {
//        this.source = source;
//        this.destination = destination;
//        this.weight = weight;
//    }
//
//    public int compareTo(Object o)
//    {
//        return this.weight.compareTo(((Edge) o).weight);
//    }
//
//    public Vertex getSource()
//    {
//        return source;
//    }
//
//    public Vertex getDestination()
//    {
//        return destination;
//    }
//
//    public T getWeight()
//    {
//        return weight;
//    }
//}
//
//class Vertex
//{
//    private String          label;
//    private List<Edge> neighbours;
//
//    public Vertex(String label)
//    {
//        this.label = label;
//        this.neighbours = new ArrayList<Edge>();
//    }
//
//    public String getLabel()
//    {
//        return label;
//    }
//
//    public void setLabel(String label)
//    {
//        this.label = label;
//    }
//
//    public List<Edge> getNeighbours()
//    {
//        return neighbours;
//    }
//
//    public void setNeighbours(List<Edge> neighbours)
//    {
//        this.neighbours = neighbours;
//    }
//}
