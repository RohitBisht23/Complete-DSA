import java.util.ArrayList;

public class Number_of_provinces {
    //DFS
    static void dfs(int node, ArrayList<Integer> graph[], int vis[]) {
        if(vis[node] == 0) {
            vis[node] = 1;
        }

        for(int i=0; i<graph[node].size(); i++) {
            if(vis[graph[node].get(i)] == 0) {
                dfs(graph[node].get(i), graph, vis);
            }
        }
    }

    static int getCountProvinces(int matrix[][]) {
        //Creating the adjacency list from the adjacency metrix
        int V = matrix.length;
        ArrayList<Integer> graph[] =  new ArrayList[V];

        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }

        //creating graph's connections
        for(int i=0; i<V; i++) {
            for(int j=0; j<V; j++) {
                //Self Nodes are not consider
                if (matrix[i][j] == 1 && i != j) {
                    graph[i].add(j);
                    graph[j].add(i);
                }
            }
        }

        //Problem solution below

        int count = 0;
        int vis[] = new int[V];
        for(int i=0; i<V; i++) {
            if(vis[i] == 0) {
                count++;
                dfs(i, graph, vis);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1},
        };

        System.out.println("Total number of provinces are :"+getCountProvinces(arr));
    }
}
