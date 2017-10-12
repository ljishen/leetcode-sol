// Question: https://leetcode.com/problems/distribute-candies/

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> numDiffs = new HashSet<>();
        for (int c : candies)  {
            numDiffs.add(c);
        }

        return Math.min(numDiffs.size(), candies.length / 2);
    }
}
