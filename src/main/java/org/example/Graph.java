
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public Vertex addVertex(String name) {
        Vertex vertex = new Vertex(name);
        vertices.add(vertex);
        return vertex;
    }

    public Vertex getVertexByName(String name) {
        for (Vertex vertex : vertices) {
            if (vertex.getName().equals(name)) {
                return vertex;
            }
        }
        return null;
    }
    // V každé iteraci for-each loopu se do proměnné vertex přiřadí aktuální prvek ze seznamu a kód uvnitř loopu se provede s tímto prvkem.
    public void addEdge(Vertex source, Vertex destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }
    // pro graf jako celek
    public int getCost(Vertex source, Vertex destination) {
        for (Edge edge : edges) {
            if (edge.getSource().equals(source) && edge.getDestination().equals(destination)) {
                return edge.getPrice();
            }
        }
        return -1;
    }
}