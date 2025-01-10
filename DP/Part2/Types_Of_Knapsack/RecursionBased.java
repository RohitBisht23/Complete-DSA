//0-1 knapsack using recursion
    
public class RecursionBased {
    public static int maxProfit(int val[],int wt[],int W,int idx)
    {
        //base case
        if(W == 0 || idx == val.length)
        {
            return 0;
        }
    
        if(wt[idx] <= W)
        {
            //include
            int ans1 =  val[idx] + maxProfit(val, wt, W - wt[idx], idx+1);
            
            //exclude
            int ans2 =  maxProfit(val, wt, W, idx+1);
            return Math.max(ans1, ans2);
        } else {
            //only exclude
            return maxProfit(val, wt, W, idx+1);
        }
    }
    public static void main(String[] args)
    {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int capacity = 7;
        System.err.println("Maximum profit:"+maxProfit(val, wt, capacity, 0));
    }
}
