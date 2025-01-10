/*
Find the number of ways to reach from (0,0) to (n-1,m-1) in a nxm grid.
Allowed moves:Down,right.
 */
public class Grid_Ways {
    public static int gribWays(int i,int j,int n,int m)
    {
        //Base case
        if(i == n-1 && j == m-1)
        {
            return 1; //The case where source and target is same
        }else if(i == n || j == m)
        {
            return 0; //The corner case when ar any point i crosses n or j crosses m.
        }
        int w1 = gribWays(i+1, j, n, m);
        int w2 = gribWays(i, j+1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args)
    {
        int n=3,m=3;
        System.out.println("Tatal ways:"+gribWays(0,0,n,m));
    }
}
