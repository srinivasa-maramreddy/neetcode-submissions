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
    public int maxDepth(TreeNode root) {
        if(root==null){
          return 0;
        }
        Queue<TreeNode>q=new LinkedList<>();
        int depth=0;
        q.add(root);
        while(!q.isEmpty()){
          int size=q.size();
          depth++;
         List<Integer>res=new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode top=q.poll();
            res.add(top.val);
            if(top.left!=null){
              q.add(top.left);
            }
            if(top.right!=null){
              q.add(top.right);
            }
          }
        }
        return depth;
    }
}
