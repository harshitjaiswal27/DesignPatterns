package behavioral_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> implements Aggregate<GraphNode<T>>{
    private final List<GraphNode<T>> graphNodes;
    public Graph() {
        this.graphNodes = new ArrayList<>();
    }
    public void addNode(GraphNode<T> graphNode){
        graphNodes.add(graphNode);
    }
    public void addNodes(List<GraphNode<T>> graphNodes){
        this.graphNodes.addAll(graphNodes);
    }
    public List<GraphNode<T>> getGraphNodes(){
        return graphNodes;
    }
    @Override
    public Iterator<GraphNode<T>> createIterator() {
        return createDFSIterator();
    }
    public Iterator<GraphNode<T>> createDFSIterator(){
        return new DFSIterator(this);
    }
    public Iterator<GraphNode<T>> creareBFSIterator(){
        return new BFSIterator(this);
    }
}
