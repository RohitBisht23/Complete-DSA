/*
Mother Vertex
We have a Directed graph, find a mother vertex in the graph(if present). A Mother vertex is a vertex
through which we can reach all the other vertices of the graph.

 */

import java.util.ArrayList;

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

    static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static int motherVertex(ArrayList<Edge>graph[],int v)
    {
        boolean vis[] = new boolean[v];

        int lastVisited = -1;
       
        for(int i=0; i<graph.length; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, vis);
                lastVisited = i;
            }
        }
        // Now, check if the lastVisited vertex is a mother vertex.
        boolean checkVis[] = new boolean[v];
        dfs(graph, lastVisited, checkVis);

        for (int i = 0; i < v; i++) {
            if (!checkVis[i]) {
                return -1; // No mother vertex found
            }
        }

        return lastVisited;
        
    }

    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[])
    {
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest])
            {
                dfs(graph, e.dest, vis);
            }
        }

    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.err.println("The mother vertex is:"+motherVertex(graph, V));
    }
}
