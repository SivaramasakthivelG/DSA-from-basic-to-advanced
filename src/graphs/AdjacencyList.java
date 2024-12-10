package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

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

        List<List<Integer>> ms = printGraph(5,arr);

        System.out.println(ms);
    }

    public static List<List<Integer>> printGraph(int V, int[][] edges) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i=0;i<V;i++){
            ls.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            ls.get(edge[0]).add(edge[1]);
            ls.get(edge[1]).add(edge[0]);
        }

//        for(int[] edge: edges){
//            int u = edge[0];
//            int v = edge[1];
//
//            ls.get(u).add(v);
//            ls.get(v).add(u);
//        }

        return ls;
    }

}
