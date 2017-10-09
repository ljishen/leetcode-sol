// Question: https://leetcode.com/problems/most-frequent-subtree-sum/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MostFrequentSubtreeSum {
    private Map<Integer, Integer> numberOfSums = new HashMap<>();
    private int maxCount = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        calc(root);

        List<Integer> sums = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : numberOfSums.entrySet()) {
            if (e.getValue() == maxCount) {
                sums.add(e.getKey());
            }
        }

        int[] res = new int[sums.size()];
        for (int i = 0; i < sums.size(); i++) {
            res[i] = sums.get(i);
        }
        return res;
    }

    private int calc(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int sum = node.val + calc(node.left) + calc(node.right);
        int count = numberOfSums.getOrDefault(sum, 0) + 1;

        maxCount = Math.max(maxCount, count);
        numberOfSums.put(sum, count);

        return sum;
    }
}
