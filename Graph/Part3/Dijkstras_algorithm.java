/*
DijsKtra's Algorithm
Shortest paths from the sourse to all vertices(weighted graph)
 */

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_algorithm {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 2));
    }

    static class Pair implements Comparable<Pair> {
        int n; // node value
        int path; // till that node distance

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // sorting based path in increasing order
        }
    }

    public static void dijsKtra(ArrayList<Edge> graph[], int src)

    {
        int dist[] = new int[graph.length];//dist[i] -> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;// positive infinite
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        boolean vis[] = new boolean[graph.length];

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!vis[curr.n]) {
                vis[curr.n] = true;

                // neighbour
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[v] > dist[u] + wt) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        //printing all source to vertices shortest path
        for(int i=0; i<dist.length; i++)
        {
            System.out.print(dist[i]+" ");
        }
        System.err.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        dijsKtra(graph, src);
    }
}
