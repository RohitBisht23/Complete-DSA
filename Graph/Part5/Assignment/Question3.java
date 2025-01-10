/*
Find whetheer it is possible to finish all tasks or not
There are a total of n tasks you have to pick, labelled from 0 to n-1. Some tasks may have 
preriquisites, for example to pick task 0 you have to first pick task 1, which is expressed as a pair
[0,1]. Given the tatal number of tasks and a list of prerquisites pairs, is it possoble for you
to finish all tasks?
sample input: [[1,0],[0,1]]
sample output: false;

sample input2: [[1,0]]
sample output: true
 */


import java.util.*;

public class Question3{
    static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }

    static void createGraph(int[][]prerequisites,ArrayList<Edge>graph[])
    {
        for(int i=0; i<graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<prerequisites.length; i++)
        {
            int src = prerequisites[i][1];
            int dest = prerequisites[i][0];

            Edge e = new Edge(src, dest);
            graph[src].add(e);
        }
    }

    public static void calculateInDegree(ArrayList<Edge>graph[],int inDegree[])
    {
        for(int i=0; i<graph.length; i++)
        {
            for(int j=0; j<graph[i].size(); j++)
            {
                Edge e = graph[i].get(j);

                inDegree[e.dest]++;
            }
        }
    }

    public static boolean topoSort(int numCourses, int prerequisites[][])
    {

        ArrayList<Edge>graph[] = new ArrayList[numCourses];
        createGraph(prerequisites, graph);

        int inDegree[] = new int[numCourses];
        calculateInDegree(graph,inDegree);

        Queue<Integer> q =new  LinkedList<>();
        for(int i=0; i<inDegree.length; i++)
        {
            if(inDegree[i] == 0)
            {
                q.add(i);
            }
        }

        int topo[] = new int[numCourses];
        int idx = 0;

        while(!q.isEmpty())
        {
            int curr = q.remove();
            topo[idx++] = curr;

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

        if(idx == numCourses)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        int[][]prerequisites = {
            {1,0},
            {2,0},
            {3,1},
            {3,2},
        };
        int numCourses = 4;
        boolean result = topoSort(numCourses,prerequisites);
        System.err.println(result);
    }
}