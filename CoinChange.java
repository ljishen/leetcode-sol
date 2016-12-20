// Question: https://leetcode.com/problems/coin-change/

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        int[] countOfAmount = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int count = -1;
            for (int c : coins) {
                if (i >= c) {
                    int curCount = countOfAmount[i - c];
                    if (curCount != -1 && (count == -1 || curCount < count)) {
                        count = curCount;
                    }
                }
            }

            if (count != -1) {
                count++;
            }

            countOfAmount[i] = count;
        }

        return countOfAmount[amount];
    }
}
