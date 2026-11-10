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
    public int diameterOfBinaryTree(TreeNode root) {
     HashMap<TreeNode,Integer>map=new HashMap<>();
     Stack<TreeNode>s=new Stack<>();
     TreeNode curr=root;
     TreeNode prev=null;
     
     int diameter=0;
     while(curr!=null ||!s.isEmpty()){
      while(curr!=null){
        s.push(curr);
        curr=curr.left;
      }
      TreeNode node=s.peek();
      if(node.right!=null&&node.right!=prev){
        curr=node.right;
      }else{
        s.pop();
        int lh=map.getOrDefault(node.left,0);
        int rh=map.getOrDefault(node.right,0);

        diameter = Math.max(diameter,lh+rh);
        map.put(node,1+Math.max(lh,rh));
        prev=node;
      }
      

     }
     return diameter;
    }
}











