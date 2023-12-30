package behavioral_patterns.iterator_pattern;

import java.util.*;

public class BFSIterator<T> implements Iterator<GraphNode<T>>{
    private final Queue<GraphNode<T>> queue;
    private final Set<GraphNode<T>> visited;
    public BFSIterator(Graph<T> graph) {
        queue = new LinkedList<>();
        visited = new HashSet<>();
        for(GraphNode<T> graphNode:graph.getGraphNodes()){
            if(!visited.contains(graphNode)){
                visited.add(graphNode);
                queue.add(graphNode);
                break;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public GraphNode<T> next() {
        if(queue.isEmpty()){
            throw new NoSuchElementException("No more elements in the iterator.");
        }
        GraphNode<T> graphNode = queue.remove();
        for(GraphNode<T> neighbor:graphNode.getNeighbors()){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                queue.add(neighbor);
            }
        }
        return graphNode;
    }
}
