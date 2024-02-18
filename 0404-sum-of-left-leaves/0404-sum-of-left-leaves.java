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
       public int ans=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if((root.left==null && root.right==null)) return 0;
        
        
        sum(root);
       
      //  System.out.print(summ);
       //  System.out.print("8");
        return ans;      
    }
    
    public boolean sum(TreeNode root){
        if(root==null) return true;
        if(root.left==null && root.right==null){
            return true;
        }
       boolean s= sum(root.left);
       
        if(s==true && root.left!=null) ans=ans + root.left.val;
        sum(root.right);
       System.out.print(ans);
        return false;
    }

}