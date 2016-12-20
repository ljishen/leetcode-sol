// Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int[] minimums = new int[prices.length - 1];

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            minimums[i - 1] = i >= 2 ? Math.min(minimums[i - 2], prices[i - 1]) : prices[i - 1];
            int possibleProfit = prices[i] - minimums[i - 1];
            if (possibleProfit > profit) {
                profit = possibleProfit;
            }
        }
        return profit;
    }
}
