/*
Bipartite Graph
A bipartite graph is a graph whose vertices can be divided into independent sets, U and V such taht 
every edge (u,v) either connects a  vertix from V to U. In other words, for every (u,v)
either u belongs to U and v belongs to V. We can also say that there is no edge that connexts vertices 
of same set.
 */

import java.util.*;

public class Bipartite_graph {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<Edge> graph[])
    {
        int color[] = new int[graph.length];
        for(int i=0; i<color.length; i++)
        {
            color[i] = -1;//no color
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++)
        {
            if(color[i] == -1)
            {
                q.add(i);
                color[i] = 0;//yellow
                
                while(!q.isEmpty())
                {
                    int curr = q.remove();
                   

                    for(int j=0; j<graph[curr].size(); j++)
                    {
                        Edge e = graph[curr].get(j);
                            
                        //case 1
                        if(color[e.dest] == -1)
                        {
                            int nextColor = color[curr] == 0? 1:0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        }
                        //case 2
                        else if(color[e.dest] == color[curr])
                        {
                            return false;
                        }
                        
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
          0---2
         /     |
        /      |
       1       4
        \     /
         \   /
           3
         */
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("Is Bipartite graph:"+isBipartite(graph));
    }
}
