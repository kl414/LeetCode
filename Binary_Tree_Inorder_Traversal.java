/**
 * Implemented both recursive and iterative ways
 * there is another iterative way called Morris Inorder traversal
 * but I'm not really understand how it works so far lol
 */
 
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null) return list;
        
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        
        return list;
    }
}
*/

//Iterative way
public class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        
        while(!st.isEmpty() || root != null){
            
            if(root == null){
                root = st.pop();
                list.add(root.val);
                root = root.right;
            }else{
                st.push(root);
                root = root.left;
            }
        }
        return list;
    }
}
