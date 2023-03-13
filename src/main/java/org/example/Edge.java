package org.example;

public class Edge {
    private Vertex source;
    private Vertex destination;
    private int price;

    public Edge(Vertex source, Vertex destination, int price) {
        this.source = source;
        this.destination = destination;
        this.price = price;
    }
    // jednotliva hrana
    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


