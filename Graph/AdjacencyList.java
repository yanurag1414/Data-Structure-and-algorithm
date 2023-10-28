package Graph;
//A finite set of vertices also called nodes.
//A finite set of ordered pair of the form (u, v) called as edge


import java.util.ArrayList;
import java.util.Arrays;



public class AdjacencyList {
    public static void main(String[] args) {
        int v =4 ;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        printGraph(adj);
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    //printing
    static void printGraph(ArrayList<ArrayList<Integer>>adj){
        for (ArrayList<Integer> integers : adj) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
