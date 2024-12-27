package graphs.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int vertex = 5;

        adjList.add(createNodeList(2, 3, 1));
        adjList.add(createNodeList(0));
        adjList.add(createNodeList(0, 4));
        adjList.add(createNodeList(0));
        adjList.add(createNodeList(2));

        System.out.println(bfsOfGraph(vertex,adjList));
    }
    private static ArrayList<Integer> createNodeList(Integer... nodes) {
        ArrayList<Integer> nodeList = new ArrayList<>();
        for (Integer node : nodes) {
            nodeList.add(node);
        }
        return nodeList;
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> arr = new ArrayList();
        boolean[] sequence = new boolean[V];
        Queue<Integer> queue = new LinkedList();

        sequence[0] = true;
        queue.offer(0);

        while(!queue.isEmpty()){
            int node = queue.poll();
            arr.add(node);

            // get the list of nodes connected to the list
            // if the node is not already visited
            // give it a offer and add to sequence

            for(int edgeN: adj.get(node)){
                if(!sequence[edgeN]){
                    sequence[edgeN] = true;
                    queue.offer(edgeN);
                }

            }
        }
        return arr;
    }

}
