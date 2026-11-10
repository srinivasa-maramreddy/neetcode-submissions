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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;

        Stack<TreeNode> s = new Stack<>();
        Map<TreeNode, Integer> map = new HashMap<>();

        TreeNode curr = root;
        TreeNode prev = null;

        map.put(root, root.val); // root max path = root value
        int count = 0;

        while (curr != null || !s.isEmpty()) {

            // go left
            while (curr != null) {
                s.push(curr);

                if (curr.left != null) {
                    int parentMax = map.get(curr);
                    map.put(curr.left, Math.max(parentMax, curr.left.val));
                }

                curr = curr.left;
            }

            TreeNode node = s.peek();

            // go right
            if (node.right != null && node.right != prev) {
                int parentMax = map.get(node);
                map.put(node.right, Math.max(parentMax, node.right.val));
                curr = node.right;
            } 
            // process node
            else {
                TreeNode n = s.pop();

                if (n.val >= map.get(n)) {
                    count++;
                }

                prev = n;
            }
        }
        return count;
    }
}
