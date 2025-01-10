//buy and sell stocks
public class buyANDsellStocks {
    public static int sellBuyStock(int price[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;  //sell price also called

        for(int i=0;i<price.length;i++)
        {
            if(buyPrice < price[i])
            {
                int Profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            }else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(Creation_string args[])
    {
        int price[] = {7,1,5,3,6,4};
        int profit = sellBuyStock(price);
        System.err.println("Maximum profit:"+profit);
    }
}
