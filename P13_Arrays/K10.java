//Best Time to Buy/Sell Stocks Program
public class K10{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]) //In this case we are getting Profit
            {
                int profit=prices[i]-buyPrice; //Today's Profit
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        System.out.println("Maximum Profit="+maxProfit); //Ans is 5 as a result of BP=1 and SP=6
    }
}