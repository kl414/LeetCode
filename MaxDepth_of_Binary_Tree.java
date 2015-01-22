/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
/**
 * Explainations: 
 * Basically using DFS to traverse the tree,
 * compare the depth against each level and find the maxDepth
 * /
 * 
public class Solution {
    //global variable for maxDepth
    public int depth;
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
            
        //first level    
        depth = 1;
        
        
        DNS(root, 1);
        
        return depth;
    }
    
    public void DNS(TreeNode node, int level){
        if(level > depth)
            depth = level;
            
        if(node.left != null)
            DNS(node.left, level+1);
        
        if(node.right != null)
            DNS(node.right, level+1);
    }
}
