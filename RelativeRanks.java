// Question: https://leetcode.com/problems/relative-ranks/

public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Integer[] ranks = new Integer[nums.length];

        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = i;
        }

        Arrays.sort(ranks, new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                return nums[j] - nums[i];
            }
        });

        String[] res = new String[ranks.length];
        for (int i = 0; i < ranks.length; i++) {
            if (i == 0) {
                res[ranks[i]] = "Gold Medal";
            } else if (i == 1) {
                res[ranks[i]] = "Silver Medal";
            } else if (i == 2) {
                res[ranks[i]] = "Bronze Medal";
            } else {
                res[ranks[i]] = Integer.toString(i + 1);
            }
        }

        return res;
    }
}
