// Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int maxDiff = 0;
    int min = -1;

    for (int p : prices) {
      if (min == -1) {
        min = p;
        continue;
      }

      if (p > min) {
        maxDiff = Math.max(maxDiff, p - min);
      }

      if (p < min) {
        min = p;
      }
    }

    return maxDiff;
  }
}
