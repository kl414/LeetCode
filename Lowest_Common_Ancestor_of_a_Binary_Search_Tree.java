/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
  * The idea is  p and q are on different sides of their LCA
  * Meaning p.val < LCA.val && q.val > LCA.val
  */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //error checking
        if(root == null || p == null || q == null)
            return null;
        //can also use a while loop if not recursive solution
        /*
        use root.val - p.val) * (root.val - q.val) > 0 is great
        but it will have overflowing issue
        */
        if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
            
        
    }
}
