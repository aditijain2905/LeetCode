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
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> a = new ArrayList<>();
        view(root,a,0);
        return a;
    }
    public void view(TreeNode root, ArrayList<Integer> a,int s){
               if(root==null) return;
            if(a.size()==s) a.add(root.val);
        view(root.right,a,s+1);
        view(root.left,a,s+1);
        
    }
}