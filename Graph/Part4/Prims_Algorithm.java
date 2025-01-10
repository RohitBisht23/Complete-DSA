/*
Prims Algorithm
MST(Minimum Spanning Tree)
Here we need to calculate the min cost or say min weight of graoh which does not have any cycle in it 
or all vertices included, maybe all edges not.
This is basically a subgraph of the original one.
This is now with undirected graph
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt =wt;
        }
    }

    static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int V;//vertix
        int cost;//cost of that vertix edge

        public Pair(int v,int c){
            this.V = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2)
        {
            return this.cost - p2.cost;//Assending order
        }
    }
    //TC:O(ElogE)

    public static void prims(ArrayList<Edge>graph[])
    {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));

        int finalCost = 0;//MST Cost / total min weight
        ArrayList<Integer> vertex = new ArrayList<>();

        while(!pq.isEmpty())
        {
            Pair curr = pq.poll();//remove
            if(!vis[curr.V])
            {
                vis[curr.V] = true;
                finalCost += curr.cost;//added in MST set
                vertex.add(curr.V);

                //Neighbours adding into PQ
                for(int i=0; i<graph[curr.V].size(); i++)
                {
                    Edge e = graph[curr.V].get(i);
                    pq.add(new Pair(e.dest, e.wt));

                }
            }
        }
        System.out.println("The min cost of MST is:"+finalCost);
        System.out.println("The MST is:\n"+vertex);
    }
    public static void main(String[] args)
    {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}
