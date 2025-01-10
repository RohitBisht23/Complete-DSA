//Impotant
public class Trapping_rainwater {
    public static int TrappedWater(int arr[],int width)
    {
        int n = arr.length;
        //calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        int TrappedWater = 0;
        //loop
        for(int i=0;i<n;i++)
        {   //water level = min(leftmax boundary,right max boundary)
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
            
            //trapped water += (water Level - arr[i])*width;
            TrappedWater += (WaterLevel - arr[i]) * width;
        }
        return TrappedWater;
    }
    public static void main(Creation_string args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        //width of every bars = 1
        int width = 1;
        int Answer = TrappedWater(height,width);
        System.out.println("The final water trapped is:"+Answer);
    }
}
