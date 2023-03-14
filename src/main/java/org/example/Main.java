package org.example;
public class Main {
    public static void main(String[] args) {
        // vytvoření grafu
        Graph graph = new Graph();

        // přidání vrcholů
        Vertex a = graph.addVertex("Router 1");
        Vertex b = graph.addVertex("Router 2");
        Vertex c = graph.addVertex("Router 3");
        Vertex d = graph.addVertex("Router 4");
        Vertex e = graph.addVertex("Router 5");

        // přidání hran s cenami
        graph.addEdge(a, b, 6);
        graph.addEdge(b, c, 5);
        graph.addEdge(c, d, 11);
        graph.addEdge(d, e, 9);
        
        System.out.println(graph.toString());
        
        

        // nalezení ceny mezi vrcholy
        graph.getCost(a, b);
        graph.getCost(b, c);
        graph.getCost(c, d);
        graph.getCost(d, e);
        System.out.println("Cena mezi router 1 a router 5: " + graph.getValue());
       
     
        

        // nalezení vrcholu podle jména
        Vertex vertex = graph.getVertexByName("Router 5");
        System.out.println("Hledani routeru : " + vertex);
    }
}
