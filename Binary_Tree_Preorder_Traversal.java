/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//Recursive way
/*
public class Solution {
    
    List<Integer> list = new ArrayList<Integer>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return list;
        
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        
        return list;
    }
}
*/

//Iterative way
public class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        while(!st.isEmpty() || root != null){
            if(root == null){
                root = st.pop().right;
            }else{
                list.add(root.val);
                st.push(root);
                root = root.left;
            }
        }
        return list;
    }
}
