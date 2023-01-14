public class Solution {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int currentProfit = 0;
        for(int i = 0; i < prices.length-1; i++){
            currentProfit += (prices[i+1] - prices[i]);
            if(currentProfit < 0)
                currentProfit = 0;
            if(currentProfit >= 0 && currentProfit >= max)
                max = currentProfit;
        }
        return max;
    }
} 