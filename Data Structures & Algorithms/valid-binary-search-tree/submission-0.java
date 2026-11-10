/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;

        while (curr != null || !stack.isEmpty()) {

            // Go to extreme left
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Visit node
            curr = stack.pop();

            // BST violation check
            if (prev != null && curr.val <= prev.val) {
                return false;
            }

            prev = curr;          // update previous
            curr = curr.right;    // go right
        }

        return true;
    }
}
