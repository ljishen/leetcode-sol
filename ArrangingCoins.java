// Question: https://leetcode.com/problems/arranging-coins/

public class ArrangingCoins {
    // By using the quadratic formula.
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(1 + 8 * (double) n) / 2 - 0.5);
    }
}
