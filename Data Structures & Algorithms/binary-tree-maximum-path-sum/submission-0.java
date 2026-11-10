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
    public int maxPathSum(TreeNode root) {
      Stack<TreeNode>s=new Stack<>();
      Map<TreeNode,Integer>map=new HashMap<>();
     
      TreeNode curr=root;
      TreeNode prev=null;
      int max=Integer.MIN_VALUE;
      while(curr!=null||!s.isEmpty()){
        while(curr!=null){
          s.push(curr);
          curr=curr.left;
        }
        TreeNode node=s.peek();
        if(node.right!=null&&node.right!=prev){
          curr=node.right;
        }else{
          s.pop();
          int lh=Math.max(0,map.getOrDefault(node.left,0));
          int rh=Math.max(0,map.getOrDefault(node.right,0));

          max=Math.max(max,lh+rh+node.val);
          map.put(node,node.val+Math.max(lh,rh));
          prev=node;

        }
      }
      return max;
        
    }
}
