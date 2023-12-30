package behavioral_patterns.iterator_pattern;

import java.util.*;

public class DFSIterator<T> implements Iterator<GraphNode<T>> {
    private final Stack<GraphNode<T>> stack;
    private final Set<GraphNode<T>> visited;

    public DFSIterator(Graph<T> graph) {
        stack = new Stack<>();
        visited = new HashSet<>();
        for(GraphNode<T> graphNode:graph.getGraphNodes()){
            if(!visited.contains(graphNode)){
                visited.add(graphNode);
                stack.push(graphNode);
                break;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    @Override
    public GraphNode<T> next() {
        if(stack.empty()){
            throw new NoSuchElementException("No more elements in the iterator.");
        }
        GraphNode<T> graphNode = stack.pop();
        for(GraphNode<T> neighbour: graphNode.getNeighbors()){
            if(!visited.contains(neighbour)){
                visited.add(neighbour);
                stack.push(neighbour);
            }
        }
        return graphNode;
    }
}
