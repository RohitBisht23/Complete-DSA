/*
Cheapest Flights Within K stops
There are n cities connected by some number of flights.You are given an array flights where 
flights[i] = [from,to,price] indicates that there is a flight.
You arealso given three integers src,dest,and k, return the cheapest price from src to dest with at
most k stops. If there is no such route , return -1.
Ex: flight[[0,1,100],[1,2,100],[0,2,500]]  src = 0,dest = 2, k = 1
output = 200.
All values are positive.
 */


import java.util.*;

public class Cheapest_flight_WithinKstops {
    static class Edge{
        int src;
        int dest;
        int price;

        public Edge(int src,int dest,int price)
        {
            this.src = src;
            this.dest = dest;
            this.price = price;
        }
    }

    static void createGraph(int flights[][],ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++)
        {
            int src = flights[i][0];
            int dest = flights[i][1];
            int price = flights[i][2];

            Edge e = new Edge(src, dest, price);
            graph[src].add(e);
        }
    }

    public static class Info{
        int v; //vertex;
        int cost;
        int stop; //stop

        public Info(int v,int c,int s)
        {
            this.v = v;
            this.cost = c;
            this.stop = s;
        }
    }
    public static int cheapestFlight(int n,int flights[][],int src,int dest,int k)
    {
        ArrayList<Edge>graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        for(int i=0; i<dist.length; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty())
        {
            Info curr = q.remove();
            if(curr.stop > k)
            {
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++)
            {
                Edge e = graph[curr.v].get(i);

                int u = e.src;
                int v = e.dest;
                int price = e.price;

                //Relaxation
                if(dist[v] > curr.cost + price && curr.stop <= k)
                {
                    dist[v] = curr.cost + price;
                    q.add(new Info(v, dist[v], curr.stop + 1));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE)
        {
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args)
    {
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0,dest = 3, k = 1;

        System.out.println("Minimum cost with k stops are:"+cheapestFlight(n, flights, src, dest, k));
    }
}
