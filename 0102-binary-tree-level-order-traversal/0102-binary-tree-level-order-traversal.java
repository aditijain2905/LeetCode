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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List< List<Integer>> s = new LinkedList<List<Integer>>();
         if(root==null) return s;
        q.add(root);
            int level=0;
        while(!q.isEmpty()){
            level = q.size();
           // Node temp = q.remove();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<level;i++){
            TreeNode temp = q.remove();
           // ArrayList<Integer> a = new ArrayList<>();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            a.add(temp.val);
            }
            s.add(a);
            
            }
        return s;
        
    }
}