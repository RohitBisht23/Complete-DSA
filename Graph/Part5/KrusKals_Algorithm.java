/*
Kruskal's Algorithm used to find the MST
 */

import java.util.*;

public class KrusKals_Algorithm {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2)
        {
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> egdes)
    {
        egdes.add(new Edge(0, 1, 10));
        egdes.add(new Edge(0, 2, 15));
        egdes.add(new Edge(0, 3, 30));
        egdes.add(new Edge(1, 3, 40));
        egdes.add(new Edge(2, 3, 50));
    }

    static int n = 4;//vertices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init()
    {
        for(int i=0; i<n; i++)
        {
            par[i] = i;
        }
    }

    public static int find(int x)
    {
        if(x == par[x])
        {
            return x;
        }
        return par[x] = find(par[x]);//path compression
    }

    public static void union(int a,int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(par[parA] == par[parB])
        {
            par[parB] = parA;
            rank[parA]++; 
        }else if(par[parA] > par[parB])
        {
            par[parB] = parA;
        }else{
            par[parA] = parB;
        }
    }

    //O(V+ElogE)
    public static void KruskalsMST(ArrayList<Edge>egdes,int V)
    {
        init();
        Collections.sort(egdes);//E(ElogE)
        int MSTCost = 0;
        int count = 0;

        for(int i=0; count < V-1; i++)//O(v)
        {
            Edge e = egdes.get(i);
            int parA = find(e.src); //src = a;
            int parB = find(e.dest); //dest = b;
            if(parA != parB){
                union(e.src, e.dest);
                MSTCost += e.wt;
                count++;
            }
        }
        System.out.println("Min cost to form MST with Kruskals also:"+ MSTCost);
    }

    public static void main(String[] args)
    {
        int V = 4;
        ArrayList<Edge> egdes = new ArrayList<>();
        createGraph(egdes);

        KruskalsMST(egdes, V);
    }
}
