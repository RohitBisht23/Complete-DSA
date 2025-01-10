//Disjoint Set DS
/*
Its a optimize DS used for implement to detect cycle in graph or for find MST in Kruskal's algo
TC: union and find both have O(4K)(mathmatically) where k is constant
in tcode its tc consider as O(1).
 */
public class Disjoint_set_DS {

    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];//Bydefault 0 will be stored

    public static void init()
    {
        for(int i=0; i<n; i++)
        {
            parent[i] = i;
        }
    }

    //find
    public static int find(int x)
    {
        if(x == parent[x])
        {
            return x;
        }

        // return find(parent[x]);//this is not effecient so to make it efficient we use path compresion optimization
        return parent[x] = find(parent[x]);//Path compresion optization
    }

    //union
    public static void union(int a,int b)
    {
        int parentA = find(a);
        int parentB = find(b);

        if(rank[parentA] == rank[parentB])//any one can join
        {
            parent[parentB] = parentA; //parentA is now parent of perantB
            rank[parentA]++;

        }else if(rank[parentA] > rank[parentB])
        {
            parent[parentB] = parentA;
        }else{
            parent[parentA] = parentB;
        }
    }
    public  static void main(String[] args)
    {
        init();

        System.out.println("Parent of 3 is :"+find(3));

        union(1, 3);
        System.out.println("Parent of 3 is :"+find(3));
        
        union(3,6);
        union(2, 4);

        union(1, 4);
        System.out.println("Parent of 4 is :"+find(4));

        union(1, 5);
    }
}
