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
    public TreeNode bstFromPreorder(int[] preorder) {
        int inorder[] = Arrays.copyOf(preorder,preorder.length);
        Arrays.sort(inorder);
        int n = inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
     public TreeNode build(int prelow , int prehi,int inlow,int inhi,int in[],int pre[]){
        if(prelow > prehi) return null;
        int val = pre[prelow];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i=inlow; i<= inhi; i++){
            if(in[i]==val){
                r=i;
                break;
            }
        }
        int cnt = r-inlow;
        root.left = build(prelow+1,prelow+cnt,inlow,r-1,in, pre);
        root.right = build(prelow+cnt+1,prehi,r+1,inhi,in,pre);
        return root;
    }
}