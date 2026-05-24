class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int profit;
        int maxProfit = 0;
        for(int num : prices){
            profit = num - min;
            maxProfit = Math.max(profit, maxProfit);
            min = Math.min(num, min);
        }
       
        return maxProfit;

    

    }
}
 