// Question: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class ConvertSortedArrayToBinarySearchTree {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }

    return gen(nums, 0, nums.length - 1);
  }

  private TreeNode gen(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }

    int mid = (right + left) / 2;
    TreeNode root = new TreeNode(nums[mid]);

    root.left = gen(nums, left, mid - 1);
    root.right = gen(nums, mid + 1, right);

    return root;
  }
}
