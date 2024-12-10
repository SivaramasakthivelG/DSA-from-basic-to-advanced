package graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<List<Integer>> adjList = new ArrayList<>();

    public Graph(int nodes) {
        for (int j = 0; j < nodes; j++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printList() {
        for (List<Integer> integers : adjList) {
            System.out.println(integers);
        }
    }

    public void dfs(int v) {
        int V = adjList.size();
        boolean[] visited = new boolean[V];
        dfs2(v, visited);
    }

    private void dfs2(int v, boolean[] visited) {
        visited[v] = true;

        System.out.print(v + " ");
        for (int i = 0; i < adjList.get(v).size(); i++) {
            int av = adjList.get(v).get(i);
            if (!visited[av]) {
                dfs2(av, visited);
            }
        }

    }


}
