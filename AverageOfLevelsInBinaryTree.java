// Question: https://leetcode.com/problems/average-of-levels-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> values = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        add(values, counts, root, 0);

        for (int i = 0; i < values.size(); i++) {
            values.set(i, values.get(i) / counts.get(i));
        }
        return values;
    }

    private void add(List<Double> values, List<Integer> counts, TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (values.size() == level) {
            values.add(node.val * 1.0);
            counts.add(1);
        } else {
            values.set(level, values.get(level) + node.val);
            counts.set(level, counts.get(level) + 1);
        }

        add(values, counts, node.left, level + 1);
        add(values, counts, node.right, level + 1);
    }
}
