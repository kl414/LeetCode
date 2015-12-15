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
  * Post-order is left, right, root
  * So we can do it by pre-order(root, left, right) and then reverse the result
  * Below uses addFirst function of LL to make the correct order
  */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        LinkedList<Integer> ls = new LinkedList<Integer>();
        if(root == null) return ls;
        
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            ls.addFirst(node.val);
            if(node.left != null)
                st.push(node.left);
            if(node.right != null)
                st.push(node.right);
        }
        
        return ls;
    }
}
