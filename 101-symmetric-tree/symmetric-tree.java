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
  public boolean SameTree(TreeNode p , TreeNode q){
    if(p==null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val ) return false;
    return SameTree(p.left,q.left) && SameTree(p.right, q.right);
  }
   public TreeNode mirror(TreeNode root){
    if(root == null) return null;
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    mirror(root.left);
    mirror(root.right);
    return root;
   }
    
    public boolean isSymmetric(TreeNode root) {
        mirror(root.right);
        return SameTree(root.left,root.right);
    }

}