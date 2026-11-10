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
    public TreeNode invertTree(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
         if (root == null) return null;
        s.push(root);
        while(!s.isEmpty()){
          TreeNode top=s.pop();
          res.add(top.val);
           TreeNode temp =top.left;
            top.left = top.right;
            top.right = temp;
          if(top.right!=null){
            s.push(top.right);
          }
          if(top.left!=null){
            s.push(top.left);
          }
        }
        return root;
    }
}
