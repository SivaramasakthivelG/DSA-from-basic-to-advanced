package graphs.dfs;

public class DFS {

    public static void main(String[] args) {

        int[][] arr = {
                {0, 1},
                {0, 4},
                {4, 1},
                {4, 3},
                {1, 3},
                {1, 2},
                {3, 2}
        };

        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(4, 1);
        graph.addEdge(4, 3);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);


        graph.printList();

        graph.dfs(0);
    }



}
