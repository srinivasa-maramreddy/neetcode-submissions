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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    
        Stack<TreeNode>s1=new Stack<>();
        s1.push(p);
        Stack<TreeNode>s2=new Stack<>();
        s2.push(q);
       
        while(!s1.isEmpty() || !s2.isEmpty()){
         TreeNode node1=s1.pop();
         TreeNode node2=s2.pop();
         if(node1==null&&node2==null){
          continue;
         }
         if(node1==null||node2==null||node1.val!=node2.val){
          return false;
         }
         s1.push(node1.right);
         s1.push(node1.left);

         s2.push(node2.right);
         s2.push(node2.left);
        }
        if(!s1.isEmpty()||!s2.isEmpty()){
          return false;
        }
        return true;
    }
}
