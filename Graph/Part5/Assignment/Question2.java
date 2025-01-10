/*
Here is the implementation of union find algorithm to check whether an undirected fraph cantain 
cycle or not.
 */
import java.util.*;
public class Question2 {
    static class Edge{
        int src;
        int dest;

        Edge(int src,int dest)
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

    static int n = 5;
    static int parent[] = new int[n];
    static int rank[] = new int[n];
    
    static void init(){
        for(int i=0; i<n; i++)
        {
            parent[i] = i;
        }
    }

    static int find(int x)
    {
        if(x == parent[x])
        {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    static void union(int a,int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB])
        {
            parent[parA] = parB;
            rank[parA]++;
        }else if(rank[parA] > rank[parB])
        {
            parent[parA] = parB;
        }else{
            parent[parB] = parA;
        }
    }

    public static boolean dfs(ArrayList<Edge>graph[],int curr,boolean vis[])
    {  
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++)
        {
            Edge e = graph[curr].get(i);
            int parA = find(e.src);
            int parB = find(e.dest);

            if(parA == parB)
            {
                return true;//cycle detected
            }

            if (!vis[e.dest]) {
                if (dfs(graph, e.dest, vis)) {
                    return true; // Cycle detected in the subtree
                }
            }
            union(e.src, e.dest);
        }
        return false;
    }
    public static boolean isCycle(ArrayList<Edge>graph[],int V)
    {
        init();
        boolean vis[] = new boolean[V];
        for(int i=0; i<V; i++)
        {
            if(!vis[i])
            {
                return dfs(graph,i,vis);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);

        System.err.println(isCycle(graph, V));
    }
}
