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
  * strictly follow the definition
  * top-down approach
  * O(n^2)
  */
 /*
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int depth(TreeNode root){
        if(root == null) return 0;
        
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
*/
/**
 * DFS solution
 * better solution than top-down since it's O(n)
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        return (depth(root) != -1);
    }
    
    public int depth(TreeNode root){
        if(root == null) return 0;
        
        int left = depth(root.left);
        if(left == -1) return -1;
        int right = depth(root.right);
        if(right == -1) return -1;
        if(Math.abs(left - right) > 1) return -1;
        
        return Math.max(left, right) + 1;
    }
}
