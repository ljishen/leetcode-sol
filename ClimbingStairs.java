// Question: https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] ways = new int[2];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ways[i] = 1;
            } else if (i == 1) {
                ways[i] = 2;
            } else {
                ways[i % 2] = ways[0] + ways[1];
            }
        }
        return ways[(n - 1) % 2];
    }
}
