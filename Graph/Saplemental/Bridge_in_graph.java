//Bridge in graph

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bridge_in_graph {
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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        // graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        // graph[4].add(new Edge(4, 5));

        // graph[5].add(new Edge(5, 3));
        // graph[5].add(new Edge(5, 4));
        
    }

    public static void dfs(ArrayList<Edge>graph[],int curr,int time,int parent,int discoveryTime[],
                                                                       int lowTime[],boolean vis[])
    {
        vis[curr] = true;
        discoveryTime[curr] = lowTime[curr] = ++time;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            //neighbour == parent
            if(e.dest == parent)
            {
                continue;
            }
            //case 2
            else if(!vis[e.dest])
            {
                dfs(graph, e.dest, time+1, curr, discoveryTime, lowTime, vis);
                lowTime[curr] = Math.min(lowTime[curr], lowTime[e.dest]);
                if(discoveryTime[curr] < lowTime[e.dest])
                {
                    System.err.println("Bridge exist in between node:"+curr+"------"+e.dest);
                }
            }
            //case 3
            else//neightbour is visited 
            {
                lowTime[curr] = Math.min(lowTime[curr], discoveryTime[e.dest]);
            }
        }
    }
    public static void tarjanBridge(ArrayList<Edge>graph[],int v)
    {
        int discoveryTime[] = new int[v];
        int lowTime[] = new int[v];
        int time = 0;

        boolean vis[] = new boolean[v];
        for(int i=0; i<graph.length; i++)
        {
            if(!vis[i])
            {
                dfs(graph,i,time,-1,discoveryTime,lowTime,vis);
            }
        }
    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);

        tarjanBridge(graph, V);
    }
}
