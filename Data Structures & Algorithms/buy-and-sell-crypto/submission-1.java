class Solution {
    public int maxProfit(int[] prices) {
        
        int b=0, s=1, maximumProfit= 0;

        while (s<prices.length){
          int profit = prices[s] - prices[b];
          if (profit < 0) {
              b=s;
          }
          else {
            if (profit>maximumProfit) {
               maximumProfit= profit;
            }

            s++;
          }
        }

        return maximumProfit;
    }
}
