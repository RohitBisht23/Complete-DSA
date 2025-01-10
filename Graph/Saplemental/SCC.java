//Strongly conneted componenets
//Using kosaraju's algo(3 step algo used for finding the SCC)

import java.util.ArrayList;
import java.util.Stack;

public class SCC {
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

    public static void topoSort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s)
    {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                topoSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void DFS(ArrayList<Edge>graph[],int curr, boolean vis[])
    {
        vis[curr] = true;

        System.out.print(curr+" ");
        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                DFS(graph, e.dest, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>graph[],int v)
    {
        //step 1 find toposort
        Stack<Integer>s = new Stack<>();
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<v; i++)
        {
            if(!vis[i])
            {
                topoSort(graph, i, vis, s);
            }
        }

        //step 2->transpose graph(same as original )
        ArrayList<Edge>transpose[] = new ArrayList[v];
        //Initialize with empty array
        for(int i=0; i<graph.length; i++)
        {
            vis[i] = false;//will use it after in code so that why it make false
            transpose[i] = new ArrayList<>();
        }

        
        //traversing in original graph and creting its transpose
        for(int i=0; i<v; i++)
        {
            //vertex neighbours
            for(int j=0; j<graph[i].size(); j++)
            {
                Edge e = graph[i].get(j);//find here edge (here egdeis:e.src->e.dest)

                transpose[e.dest].add(new Edge(e.dest, e.src));//transpose here(reverse edge)
            }
        }

        //step 3
        while(!s.empty())
        {
            int curr = s.pop();
            if(!vis[curr])
            {
                System.err.print("Strongly Connected Componets->");
                DFS(transpose, curr, vis);
                System.err.println();
            }
        }
    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);
    }
}
