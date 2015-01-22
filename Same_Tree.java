/**
 * Use DFS to traverse through and compare each node
 * /

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //edge case
        if(p == null){
            if(q != null)
                return false;
            else
                return true;
        }else{
            if(q == null)
                return false;
        }
        
        if(p.val != q.val)
            return false;
        else{
            if(isSameTree(p.left, q.left))
                return isSameTree(p.right, q.right);
            else
                return false;
        }
    }
}
