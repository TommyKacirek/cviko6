


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

    public void addEdge(Vertex source, Vertex destination, int weight, String packagePath) {
        Edge edge = new Edge(source, destination, weight, packagePath);
        edges.add(edge);
    }

    public int getCost(Vertex source, Vertex destination, String packagePath) {
        for (Edge edge : edges) {
            if (edge.getSource().equals(source) && edge.getDestination().equals(destination) && edge.getPackagePath().startsWith(packagePath)) {
                return edge.getPrice();
            }
        }
        return -1;
    }
}
