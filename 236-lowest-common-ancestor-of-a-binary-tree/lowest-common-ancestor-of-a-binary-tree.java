/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null) return null;
//         if(root==p || root==q) return root;
//         boolean pliesInleft = exist(root.left,p);
//         boolean qliesInRight = exist(root.right,q);
//         if(pliesInleft && !qliesInRight) return lowestCommonAncestor(root.left,p,q);
//         if(qliesInRight && !pliesInleft) return lowestCommonAncestor(root.right,p,q);
//         else return root;
//     }
//     public boolean exist(TreeNode root , TreeNode val){
//         if(root == null) return false;
//         if(root == val) return true;
//         return exist(root.left,val) || exist(root.right,val);
//     }
// }

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        if(left != null){
            return left;
        }else return right;
    }
}