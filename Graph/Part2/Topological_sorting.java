//Topological sorting using DFS

import java.util.ArrayList;
import java.util.Stack;

public class Topological_sorting {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topologicalSortUtil(ArrayList<Edge>graph[],int curr, boolean vis[],Stack<Integer>s)
    {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                topologicalSortUtil(graph, e.dest, vis, s);
            }
        }
        s.add(curr);
    }

    public static void topologicalSort(ArrayList<Edge>graph[])
    {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++)
        {
            if(!vis[i])
            {
                topologicalSortUtil(graph,i,vis,s);
            }
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args)
    {
        //Diagram of graph in the note book of 28/9/23 date
        int V = 6;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);

        topologicalSort(graph);
    }
}