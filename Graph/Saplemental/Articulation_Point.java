/*
Articulation Point(Tarjan algorithm)
A vertex in an undirected connected graph is an articulation point(or cut vertex) if removing it(and
edges throung it) increases the connected components of graph.
 */

import java.util.ArrayList;

public class Articulation_Point {
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
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>graph[],int curr,int parent,int time,
                                                      int discoveryTime[],int low[],boolean vis[],boolean ap[])
    {
        vis[curr] = true;
        discoveryTime[curr] = low[curr] = ++time;
        int children = 0;

        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            int neigh = e.dest; 
            
            if(parent == neigh)
            {
                continue;
            }
            else if(vis[neigh])
            {
                low[curr] = Math.min(low[curr],discoveryTime[neigh]);
            }else{//not visited
                dfs(graph, neigh, curr, time, discoveryTime, low, vis,ap);
                low[curr] = Math.min(low[curr],low[neigh]);

                if(parent != -1 && discoveryTime[curr] <= low[neigh])
                {
                    // System.out.println("Ap:"+curr);//instead of this better will below
                    ap[curr] = true;
                }
                children++;
            }
        }

        if(parent == -1 && children > 1)
        {
            // System.err.println("AP:"+curr);//better will be
            ap[curr] = true;
        }
    }
    public static void getAP(ArrayList<Edge>graph[],int V)
    {
        int discoveryTime[] = new int[V];
        int low[] = new int[V];
        int time = 0;

        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];
        for(int i=0; i<graph.length; i++)
        {
            if(!vis[i])
            {
                dfs(graph, i, -1, time, discoveryTime, low, vis,ap);
            }
        }

        //printing Articulation point
        for(int i=0; i<ap.length; i++)
        {
            if(ap[i])
            {
                System.err.println("AP : "+i);
            }
        }
    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        getAP(graph, V);
    }
}
