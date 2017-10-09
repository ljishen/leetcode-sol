// Question: https://leetcode.com/problems/subtree-of-another-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (compare(s, t)) {
            return true;
        }

        return (s.left != null && isSubtree(s.left, t)) || (s.right != null && isSubtree(s.right, t));
    }

    private boolean compare(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null || s.val != t.val) {
            return false;
        }

        return compare(s.left, t.left) && compare(s.right, t.right);
    }
}
