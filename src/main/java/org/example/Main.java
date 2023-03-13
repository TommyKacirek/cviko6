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

        // přidání hran s cenami
        graph.addEdge(a, b, 5);
        graph.addEdge(a, c, 3);
        graph.addEdge(b, d, 2);
        graph.addEdge(c, d, 4);

        // nalezení ceny mezi vrcholy
        int cost = graph.getCost(a, b);
        System.out.println("Cena mezi router 1 a router 2: " + cost);

        // nalezení vrcholu podle jména
        Vertex vertex = graph.getVertexByName("Router 4");
        System.out.println("Hledani routeru : " + vertex);
    }
}
