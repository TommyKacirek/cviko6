import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;
    private int value;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.value = 0;
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
    public void addEdge(Vertex source, Vertex destination, int price) {
    	int x = 0;
        Edge edgeForward = new Edge(source, destination, price);
        Edge edgeBackward = new Edge(destination,source,price);
        for (Edge edge : edges) {
        	if (edge.getDestination().equals(destination) && edge.getSource().equals(source)) {
        		x = 1;
        	}
        }
        if (x == 0) {
        	edges.add(edgeForward);
        	edges.add(edgeBackward);
        }
    }
    
    // pro graf jako celek
    public int getCost(Vertex source, Vertex destination) {
        for (Edge edge : edges) {
            if (edge.getSource().equals(source) && edge.getDestination().equals(destination)) {
                value += edge.getPrice();
            }
        }
        return -1;
    }

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Graph [vertices=" + vertices + ", edges=" + edges + ", value=" + value + "]";
	}
    
	
}
