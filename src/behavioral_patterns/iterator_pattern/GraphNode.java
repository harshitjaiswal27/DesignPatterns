package behavioral_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
    private final T value;
    private final List<GraphNode<T>> neighbors;

    public GraphNode(T value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
    public void addNeighbour(GraphNode<T> graphNode){
        neighbors.add(graphNode);
    }
    public void addNeighbours(List<GraphNode<T>> graphNodes){
        neighbors.addAll(graphNodes);
    }
    public T getValue() {
        return value;
    }
    public List<GraphNode<T>> getNeighbors() {
        return neighbors;
    }
}
