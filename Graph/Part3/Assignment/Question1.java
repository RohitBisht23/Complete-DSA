/*
Detect Cycle In An Undirected Graph Using BFS
we have an undirected graph, how to chech if there is a cycle in a graph? For example, the folowing
graoh has a cycle
 1-- 0--- 2--- 1
output: yes
 */

import java.sql.Array;
import java.util.*;

public class Question1 {
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1, 0)); 
        graph[1].add(new Edge(1, 3));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean visit[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if(isCycleUtil(graph, i, visit)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int src, boolean visit[]) {
        Queue<Integer> q = new LinkedList<>();
        int parent[] = new int[graph.length];
        q.add(src);
        parent[src] = -1;
    
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visit[curr] == false) {
                visit[curr] = true;
    
                // Neighbors
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
    
                    if (visit[e.dest] == false) {
                        q.add(e.dest);
                        parent[e.dest] = curr;
                        
                    } else if (visit[e.dest]== true  && parent[curr] != e.dest ) {
                        // Cycle found, add the edge to the result
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int V = 7;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        System.err.println(isCycle(graph));
    }
}
