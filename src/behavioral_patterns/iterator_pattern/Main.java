package behavioral_patterns.iterator_pattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        GraphNode<String> graphNode1 = new GraphNode<>("Alan");
        GraphNode<String> graphNode2 = new GraphNode<>("Alex");
        GraphNode<String> graphNode3 = new GraphNode<>("Andrew");
        GraphNode<String> graphNode4 = new GraphNode<>("Bob");
        GraphNode<String> graphNode5 = new GraphNode<>("Carl");
        graphNode1.addNeighbours(Arrays.asList(graphNode2, graphNode3));
        graphNode2.addNeighbour(graphNode4);
        graphNode3.addNeighbour(graphNode5);
        graphNode4.addNeighbour(graphNode5);
        graph.addNodes(Arrays.asList(graphNode1,graphNode2,graphNode3,graphNode4));
        graph.addNode(graphNode5);
        Iterator<GraphNode<String>> iterator = graph.createDFSIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }
        System.out.println("====================");
        iterator = graph.creareBFSIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getValue());
        }
    }
}
