/*
Question: GIven a route containing 4 directions(E,W,N,S),
find the shortest path to erach destination
Time complexity: O(n) 
*/
public class Shortest_path {
    public static float getShotestPath(String path)
    {   
        // x and y represent the current postion at coordinat 0
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++)
        {
            int direction = path.charAt(i); //getting direction
            //east
            if(direction == 'E')
            {
                x++;
            }
            //north
            else if(direction == 'N')
            {
                y++;
            }
            //west
            else if(direction == 'E')
            {
                x--;
            }
            //south
            else{
                y--;
            }
        }
        //X2 and Y2 represent the square of x and y
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[])
    {
        String path = "WNEENEWEWEWEWEWESENNN";
        float result = getShotestPath(path);
        System.out.print("Shotest part:"+result);
    }
}
