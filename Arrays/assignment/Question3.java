/*
Question 3: You are given an array price where price[i] is the price of a 
given stock on ith day.
Return the maximum profit you can achieve from this transaction. If you
cannot achieve profit return 0.
NOTE: Buying on 2day and selling on day 1 is not allowed because you must
buy before you sell.
 */
public class Question3 {
    public static int stockProfit(int price[])
    {
        int BuyPrice = price[0];
        int MaxProfit = 0;
        for(int i =1;i<price.length;i++)
        {
            if(BuyPrice < price[i])
            {
                MaxProfit = Math.max(MaxProfit, price[i]-BuyPrice);
            }else{
                BuyPrice = price[i];
            }
        }
       
        return MaxProfit;
    }
    public static void main(String args[])
    {
        int price[] = {7,1,5,3,6,4};
        int Profit = stockProfit(price);
        System.out.print("The maximum profit achieved:"+Profit);
    }
    
}
