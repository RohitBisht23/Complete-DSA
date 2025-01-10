/*Topological sort using BFS
Using here Kahn's Algorithm(this algorithm based of In-degree and Out-degree)
*/

import java.util.*;

public class Topological_srot_BFS {
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

    public static void calculateInDegree(ArrayList<Edge>graph[],int inDegree[])
    {
        for(int i=0; i<graph.length; i++)
        {
            int v = i;
            for(int j=0; j<graph[v].size(); j++)
            {
                Edge e = graph[v].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge>graph[])
    {
        //first find every node in-degree
        int inDegree[] = new int[graph.length];
        calculateInDegree(graph,inDegree);

        Queue<Integer>q = new LinkedList<>();

        //the node whose inDegree 0 add them into queue
        for(int i=0; i<inDegree.length; i++)
        {
            if(inDegree[i] == 0)
            {
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty())
        {
            int curr = q.remove();
            System.out.print(curr+" ");//printing topological sort

            //checking for neighbours
            for(int i=0; i<graph[curr].size(); i++)
            {
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if(inDegree[e.dest] == 0)
                {
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        //graph in notebook check for date 28/9/23
        int V = 6;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}
