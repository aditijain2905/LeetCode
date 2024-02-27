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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
       return max;
        
    }
    public int func(TreeNode root){
      
        if(root==null) return 0;
        int left = func(root.left);
        int right = func(root.right);
        max = Math.max(left+right,max);
        return Math.max(left,right)+1;
    }
}