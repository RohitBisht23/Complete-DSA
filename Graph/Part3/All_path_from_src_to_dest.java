/*
All path from src to dest
 */

import java.util.ArrayList;

public class All_path_from_src_to_dest {
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void findAllPath(ArrayList<Edge>graph[],int s,int d,String path)
    {
        if(s == d)
        {
            System.out.println(path+d);
        }

        for(int i=0; i<graph[s].size(); i++)
        {
            Edge e = graph[s].get(i);
            findAllPath(graph, e.dest, d, path+s);
        }
    }

    public static void main(String[] args)
    {
        int V = 6;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);

        int source = 5;
        int destinatio = 1;
        findAllPath(graph,source,destinatio,"");
    }
}
