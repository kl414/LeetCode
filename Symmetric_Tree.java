/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//recursive
/*
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return helper(left.right, right.left) && helper(left.left, right.right);
    }
}
*/

//iterative
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root.left);
        st.push(root.right);
        
        while(!st.empty()){
            TreeNode p1 = st.pop();
            TreeNode p2 = st.pop();
            if(p1 == null && p2 == null)
                continue; 
            if(p1 == null || p2 == null)
                return false;
            if(p1.val == p2.val){
                st.push(p1.left);
                st.push(p2.right);
                st.push(p1.right);
                st.push(p2.left);
            }else{
                return false;
            }
        }
        
        return true;
    }
}
