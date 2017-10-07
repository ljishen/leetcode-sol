// Question: https://leetcode.com/problems/poor-pigs/

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int rows = minutesToTest / minutesToDie + 1;
        while (Math.pow(rows, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}
