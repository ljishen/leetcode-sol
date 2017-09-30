// Question: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversalII {
    private List<List<Integer>> valuesOfTiers = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        add(root, 0);
        return valuesOfTiers;
    }

    private void add(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (valuesOfTiers.size() == level) {
            valuesOfTiers.add(0, new ArrayList<Integer>());
        }

        add(node.left, level + 1);
        add(node.right, level + 1);

        valuesOfTiers.get(valuesOfTiers.size() - 1 - level).add(node.val);
    }
}
