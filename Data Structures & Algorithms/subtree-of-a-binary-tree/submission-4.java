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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.val == subRoot.val) {
                Queue<TreeNode> q1 = new LinkedList<>();
                Queue<TreeNode> q2 = new LinkedList<>();

                q1.add(curr);
                q2.add(subRoot);

                boolean mismatch = false;

                while (!q1.isEmpty() && !q2.isEmpty()) {
                    TreeNode n1 = q1.poll();
                    TreeNode n2 = q2.poll();

                    if (n1 == null && n2 == null) continue;

                    if (n1 == null || n2 == null || n1.val != n2.val) {
                        mismatch = true;
                        break;
                    }

                    q1.add(n1.left);
                    q1.add(n1.right);
                    q2.add(n2.left);
                    q2.add(n2.right);
                }

                // ✅ must finish BOTH and no mismatch
                if (!mismatch && q1.isEmpty() && q2.isEmpty()) {
                    return true;
                }
            }

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        return false;
    }
}
