//Trapped water question 
public class Question4 {
    public static int TrappedWater(int arr[])
    {
        int n = arr.length;
        //leftMax boundary
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        } 
        //rightMax boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        //trapped water calculating
        int Trapped = 0;
        for(int i = 0;i< n;i++)
        {
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            Trapped += (WaterLevel - arr[i]);
        }
        return Trapped;
    }
    public static void main(String args[])
    {
        int bars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int Answer = TrappedWater(bars);
        System.out.println("Total trapped water:"+Answer);
    }
}
